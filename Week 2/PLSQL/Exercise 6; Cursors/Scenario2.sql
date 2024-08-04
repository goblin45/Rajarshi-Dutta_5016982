DECLARE
    CURSOR cur_ApplyAnnualFee IS
        SELECT AccountID, Balance FROM Accounts;

    v_AccountID Accounts.AccountID%TYPE;
    v_Balance Accounts.Balance%TYPE;
    v_AnnualFee CONSTANT NUMBER := 50; -- Set the annual fee amount
BEGIN
    OPEN cur_ApplyAnnualFee;

    LOOP
        FETCH cur_ApplyAnnualFee INTO v_AccountID, v_Balance;
        EXIT WHEN cur_ApplyAnnualFee%NOTFOUND;

        -- Deduct the annual fee from the balance
        UPDATE Accounts
        SET Balance = v_Balance - v_AnnualFee,
            LastModified = SYSDATE
        WHERE AccountID = v_AccountID;

        DBMS_OUTPUT.PUT_LINE('Annual fee applied to Account ID: ' || v_AccountID);
    END LOOP;

    CLOSE cur_ApplyAnnualFee;

    COMMIT;
END;
/
