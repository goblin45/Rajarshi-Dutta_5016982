DECLARE
    v_CustomerID Customers.CustomerID%TYPE;
    v_DOB Customers.DOB%TYPE;
    v_Age NUMBER;
    v_LoanID Loans.LoanID%TYPE;
    v_InterestRate Loans.InterestRate%TYPE;
BEGIN
    FOR cust_rec IN (SELECT CustomerID, DOB FROM Customers) LOOP
        v_CustomerID := cust_rec.CustomerID;
        v_DOB := cust_rec.DOB;

        v_Age := TRUNC(MONTHS_BETWEEN(SYSDATE, v_DOB) / 12);

        IF v_Age > 60 THEN
            FOR loan_rec IN (SELECT LoanID, InterestRate FROM Loans WHERE CustomerID = v_CustomerID) LOOP
                v_LoanID := loan_rec.LoanID;
                v_InterestRate := loan_rec.InterestRate;

                -- Apply 1% discount to the interest rate
                v_InterestRate := v_InterestRate - 1;

                UPDATE Loans
                SET InterestRate = v_InterestRate
                WHERE LoanID = v_LoanID;
            END LOOP;
        END IF;
    END LOOP;

    COMMIT;
END;
/
