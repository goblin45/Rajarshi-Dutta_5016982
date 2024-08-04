CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    -- Insert a new record into the AuditLog table
    INSERT INTO AuditLog (
        AuditID,
        TransactionID,
        AccountID,
        TransactionDate,
        Amount,
        TransactionType,
        LoggedAt
    ) VALUES (
        AuditLog_seq.NEXTVAL, -- Assuming a sequence AuditLog_seq for generating primary key
        :NEW.TransactionID,
        :NEW.AccountID,
        :NEW.TransactionDate,
        :NEW.Amount,
        :NEW.TransactionType,
        SYSDATE
    );
END LogTransaction;
/
