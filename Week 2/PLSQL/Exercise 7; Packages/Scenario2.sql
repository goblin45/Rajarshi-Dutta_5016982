CREATE OR REPLACE PACKAGE EmployeeManagement IS
    PROCEDURE HireEmployee(
        p_EmployeeID IN Employees.EmployeeID%TYPE,
        p_Name IN Employees.Name%TYPE,
        p_Position IN Employees.Position%TYPE,
        p_Salary IN Employees.Salary%TYPE,
        p_Department IN Employees.Department%TYPE
    );

    PROCEDURE UpdateEmployeeDetails(
        p_EmployeeID IN Employees.EmployeeID%TYPE,
        p_Name IN Employees.Name%TYPE,
        p_Position IN Employees.Position%TYPE,
        p_Salary IN Employees.Salary%TYPE,
        p_Department IN Employees.Department%TYPE
    );

    FUNCTION CalculateAnnualSalary(
        p_EmployeeID IN Employees.EmployeeID%TYPE
    ) RETURN NUMBER;
END EmployeeManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement IS
    PROCEDURE HireEmployee(
        p_EmployeeID IN Employees.EmployeeID%TYPE,
        p_Name IN Employees.Name%TYPE,
        p_Position IN Employees.Position%TYPE,
        p_Salary IN Employees.Salary%TYPE,
        p_Department IN Employees.Department%TYPE
    ) IS
    BEGIN
        INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
        VALUES (p_EmployeeID, p_Name, p_Position, p_Salary, p_Department, SYSDATE);

        COMMIT;
    END HireEmployee;

    PROCEDURE UpdateEmployeeDetails(
        p_EmployeeID IN Employees.EmployeeID%TYPE,
        p_Name IN Employees.Name%TYPE,
        p_Position IN Employees.Position%TYPE,
        p_Salary IN Employees.Salary%TYPE,
        p_Department IN Employees.Department%TYPE
    ) IS
    BEGIN
        UPDATE Employees
        SET Name = p_Name,
            Position = p_Position,
            Salary = p_Salary,
            Department = p_Department,
            HireDate = SYSDATE
        WHERE EmployeeID = p_EmployeeID;

        COMMIT;
    END UpdateEmployeeDetails;

    FUNCTION CalculateAnnualSalary(
        p_EmployeeID IN Employees.EmployeeID%TYPE
    ) RETURN NUMBER IS
        v_AnnualSalary NUMBER;
    BEGIN
        SELECT Salary * 12 INTO v_AnnualSalary FROM Employees WHERE EmployeeID = p_EmployeeID;
        RETURN v_AnnualSalary;
    END CalculateAnnualSalary;
END EmployeeManagement;
/
