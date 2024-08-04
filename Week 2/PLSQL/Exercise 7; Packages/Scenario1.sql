CREATE OR REPLACE PACKAGE CustomerManagement IS
    PROCEDURE AddCustomer(
        p_CustomerID IN Customers.CustomerID%TYPE,
        p_Name IN Customers.Name%TYPE,
        p_DOB IN Customers.DOB%TYPE,
        p_Balance IN Customers.Balance%TYPE
    );

    PROCEDURE UpdateCustomer(
        p_CustomerID IN Customers.CustomerID%TYPE,
        p_Name IN Customers.Name%TYPE,
        p_DOB IN Customers.DOB%TYPE,
        p_Balance IN Customers.Balance%TYPE
    );

    FUNCTION GetCustomerBalance(
        p_CustomerID IN Customers.CustomerID%TYPE
    ) RETURN NUMBER;
END CustomerManagement;
/

CREATE OR REPLACE PACKAGE BODY CustomerManagement IS
    PROCEDURE AddCustomer(
        p_CustomerID IN Customers.CustomerID%TYPE,
        p_Name IN Customers.Name%TYPE,
        p_DOB IN Customers.DOB%TYPE,
        p_Balance IN Customers.Balance%TYPE
    ) IS
    BEGIN
        INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
        VALUES (p_CustomerID, p_Name, p_DOB, p_Balance, SYSDATE);

        COMMIT;
    END AddCustomer;

    PROCEDURE UpdateCustomer(
        p_CustomerID IN Customers.CustomerID%TYPE,
        p_Name IN Customers.Name%TYPE,
        p_DOB IN Customers.DOB%TYPE,
        p_Balance IN Customers.Balance%TYPE
    ) IS
    BEGIN
        UPDATE Customers
        SET Name = p_Name,
            DOB = p_DOB,
            Balance = p_Balance,
            LastModified = SYSDATE
        WHERE CustomerID = p_CustomerID;

        COMMIT;
    END UpdateCustomer;

    FUNCTION GetCustomerBalance(
        p_CustomerID IN Customers.CustomerID%TYPE
    ) RETURN NUMBER IS
        v_Balance Customers.Balance%TYPE;
    BEGIN
        SELECT Balance INTO v_Balance FROM Customers WHERE CustomerID = p_CustomerID;
        RETURN v_Balance;
    END GetCustomerBalance;
END CustomerManagement;
/
