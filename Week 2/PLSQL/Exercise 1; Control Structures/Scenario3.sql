DECLARE
    v_CustomerID Loans.CustomerID%TYPE;
    v_LoanID Loans.LoanID%TYPE;
    v_EndDate Loans.EndDate%TYPE;
    v_Name Customers.Name%TYPE;
BEGIN
    FOR loan_rec IN (
        SELECT LoanID, CustomerID, EndDate 
        FROM Loans 
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        v_LoanID := loan_rec.LoanID;
        v_CustomerID := loan_rec.CustomerID;
        v_EndDate := loan_rec.EndDate;

        SELECT Name INTO v_Name FROM Customers WHERE CustomerID = v_CustomerID;

        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || v_Name || 
                             ', your loan (ID: ' || v_LoanID || 
                             ') is due on ' || TO_CHAR(v_EndDate, 'DD-MON-YYYY') || '.');
    END LOOP;
END;
/
