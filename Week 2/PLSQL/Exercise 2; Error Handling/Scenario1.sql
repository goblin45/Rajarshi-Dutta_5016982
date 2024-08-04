CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    p_FromAccountID IN Accounts.AccountID%TYPE,
    p_ToAccountID IN Accounts.AccountID%TYPE,
    p_Amount IN NUMBER
) IS
    v_FromBalance Accounts.Balance%TYPE;
    v_ToBalance Accounts.Balance%TYPE;
BEGIN
    -- Fetch the balances of both accounts
    SELECT Balance INTO v_FromBalance FROM Accounts WHERE AccountID = p_FromAccountID FOR UPDATE;
    SELECT Balance INTO v_ToBalance FROM Accounts WHERE AccountID = p_ToAccountID FOR UPDATE;

    -- Check for sufficient funds
    IF v_FromBalance < p_Amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in the source account.');
    END IF;

    -- Perform the transfer
    UPDATE Accounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_FromAccountID;

    UPDATE Accounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_ToAccountID;

    COMMIT;

EXCEPTION
    WHEN OTHERS THEN
        -- Log the error and rollback the transaction
        DBMS_OUTPUT.PUT_LINE('Error during fund transfer: ' || SQLERRM);
        ROLLBACK;
END SafeTransferFunds;
/
