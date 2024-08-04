CREATE OR REPLACE PACKAGE AccountOperations IS
    PROCEDURE OpenAccount(
        p_AccountID IN Accounts.AccountID%TYPE,
        p_CustomerID IN Accounts.CustomerID%TYPE,
        p_AccountType IN Accounts.AccountType%TYPE,
        p_Balance IN Accounts.Balance%TYPE
    );

    PROCEDURE CloseAccount(
        p_AccountID IN Accounts.AccountID%TYPE
    );

    FUNCTION GetTotalBalance(
        p_CustomerID IN Accounts.CustomerID%TYPE
    ) RETURN NUMBER;
END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations IS
    PROCEDURE OpenAccount(
        p_AccountID IN Accounts.AccountID%TYPE,
        p_CustomerID IN Accounts.CustomerID%TYPE,
        p_AccountType IN Accounts.AccountType%TYPE,
        p_Balance IN Accounts.Balance%TYPE
    ) IS
    BEGIN
        INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
        VALUES (p_AccountID, p_CustomerID, p_AccountType, p_Balance, SYSDATE);

        COMMIT;
    END OpenAccount;

    PROCEDURE CloseAccount(
        p_AccountID IN Accounts.AccountID%TYPE
    ) IS
    BEGIN
        DELETE FROM Accounts WHERE AccountID = p_AccountID;

        COMMIT;
    END CloseAccount;

    FUNCTION GetTotalBalance(
        p_CustomerID IN Accounts.CustomerID%TYPE
    ) RETURN NUMBER IS
        v_TotalBalance NUMBER;
    BEGIN
        SELECT SUM(Balance) INTO v_TotalBalance FROM Accounts WHERE CustomerID = p_CustomerID;
        RETURN v_TotalBalance;
    END GetTotalBalance;
END AccountOperations;
/
