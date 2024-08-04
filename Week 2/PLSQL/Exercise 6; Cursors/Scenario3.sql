DECLARE
    CURSOR cur_UpdateLoanInterestRates IS
        SELECT LoanID, InterestRate FROM Loans;

    v_LoanID Loans.LoanID%TYPE;
    v_InterestRate Loans.InterestRate%TYPE;
    v_NewInterestRate NUMBER;
BEGIN
    OPEN cur_UpdateLoanInterestRates;

    LOOP
        FETCH cur_UpdateLoanInterestRates INTO v_LoanID, v_InterestRate;
        EXIT WHEN cur_UpdateLoanInterestRates%NOTFOUND;

        -- Define the new interest rate based on the new policy (e.g., reduce by 0.5%)
        v_NewInterestRate := v_InterestRate - 0.5;

        -- Update the loan interest rate
        UPDATE Loans
        SET InterestRate = v_NewInterestRate
        WHERE LoanID = v_LoanID;

        DBMS_OUTPUT.PUT_LINE('Interest rate updated for Loan ID: ' || v_LoanID);
    END LOOP;

    CLOSE cur_UpdateLoanInterestRates;

    COMMIT;
END;
/
