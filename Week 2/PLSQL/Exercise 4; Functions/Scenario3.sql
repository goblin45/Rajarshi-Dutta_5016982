CREATE OR REPLACE FUNCTION HasSufficientBalance(
    p_AccountID IN Accounts.AccountID%TYPE,
    p_Amount IN NUMBER
) RETURN BOOLEAN IS
    v_Balance Accounts.Balance%TYPE;
BEGIN
    -- Retrieve the current balance of the account
    SELECT Balance INTO v_Balance FROM Accounts WHERE AccountID = p_AccountID;
    
    -- Check if the balance is sufficient
    IF v_Balance >= p_Amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
END HasSufficientBalance;
/
