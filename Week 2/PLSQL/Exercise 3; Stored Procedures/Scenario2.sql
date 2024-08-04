CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_Department IN Employees.Department%TYPE,
    p_BonusPercentage IN NUMBER
) IS
BEGIN
    FOR emp_rec IN (SELECT EmployeeID, Salary FROM Employees WHERE Department = p_Department) LOOP
        -- Update the salary with the bonus percentage
        UPDATE Employees
        SET Salary = Salary + (Salary * p_BonusPercentage / 100),
            HireDate = SYSDATE
        WHERE EmployeeID = emp_rec.EmployeeID;
    END LOOP;

    COMMIT;
END UpdateEmployeeBonus;
/
