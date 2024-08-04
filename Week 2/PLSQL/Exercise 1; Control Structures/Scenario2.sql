ALTER TABLE Customers ADD IsVIP CHAR(1) DEFAULT 'F';

DECLARE
    v_CustomerID Customers.CustomerID%TYPE;
    v_Balance Customers.Balance%TYPE;
BEGIN
    FOR cust_rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
        v_CustomerID := cust_rec.CustomerID;
        v_Balance := cust_rec.Balance;

        IF v_Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'T'
            WHERE CustomerID = v_CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/
