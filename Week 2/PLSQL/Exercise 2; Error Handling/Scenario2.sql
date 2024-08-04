CREATE OR REPLACE PROCEDURE UpdateSalary(
    p_EmployeeID IN Employees.EmployeeID%TYPE,
    p_Percentage IN NUMBER
) IS
    v_Salary Employees.Salary%TYPE;
BEGIN
    -- Attempt to fetch the current salary
    SELECT Salary INTO v_Salary FROM Employees WHERE EmployeeID = p_EmployeeID FOR UPDATE;

    -- Increase the salary by the given percentage
    v_Salary := v_Salary + (v_Salary * p_Percentage / 100);

    -- Update the employee's salary
    UPDATE Employees
    SET Salary = v_Salary
    WHERE EmployeeID = p_EmployeeID;

    COMMIT;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        -- Handle the case where the employee ID does not exist
        DBMS_OUTPUT.PUT_LINE('Error: Employee ID ' || p_EmployeeID || ' does not exist.');
    WHEN OTHERS THEN
        -- Log any other errors
        DBMS_OUTPUT.PUT_LINE('Error updating salary: ' || SQLERRM);
        ROLLBACK;
END UpdateSalary;
/
