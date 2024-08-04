CREATE OR REPLACE PROCEDURE AddNewCustomer(
    p_CustomerID IN Customers.CustomerID%TYPE,
    p_Name IN Customers.Name%TYPE,
    p_DOB IN Customers.DOB%TYPE,
    p_Balance IN Customers.Balance%TYPE
) IS
BEGIN
    -- Attempt to insert the new customer
    INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
    VALUES (p_CustomerID, p_Name, p_DOB, p_Balance, SYSDATE);

    COMMIT;

EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        -- Handle the case where the customer ID already exists
        DBMS_OUTPUT.PUT_LINE('Error: Customer ID ' || p_CustomerID || ' already exists.');
    WHEN OTHERS THEN
        -- Log any other errors
        DBMS_OUTPUT.PUT_LINE('Error adding new customer: ' || SQLERRM);
        ROLLBACK;
END AddNewCustomer;
/
