CREATE OR REPLACE PROCEDURE TransferFunds(
    p_FromAccountID IN Accounts.AccountID%TYPE,
    p_ToAccountID IN Accounts.AccountID%TYPE,
    p_Amount IN NUMBER
) IS
    v_FromBalance Accounts.Balance%TYPE;
BEGIN
    -- Check the balance of the source account
    SELECT Balance INTO v_FromBalance FROM Accounts WHERE AccountID = p_FromAccountID FOR UPDATE;

    -- Check if sufficient balance exists
    IF v_FromBalance < p_Amount THEN
        RAISE_APPLICATION_ERROR(-20002, 'Insufficient funds in the source account.');
    END IF;

    -- Debit the source account
    UPDATE Accounts
    SET Balance = Balance - p_Amount,
        LastModified = SYSDATE
    WHERE AccountID = p_FromAccountID;

    -- Credit the destination account
    UPDATE Accounts
    SET Balance = Balance + p_Amount,
        LastModified = SYSDATE
    WHERE AccountID = p_ToAccountID;

    COMMIT;

EXCEPTION
    WHEN OTHERS THEN
        -- Handle errors and rollback transaction
        DBMS_OUTPUT.PUT_LINE('Error during fund transfer: ' || SQLERRM);
        ROLLBACK;
END TransferFunds;
/
