CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_LoanAmount IN NUMBER,
    p_InterestRate IN NUMBER,
    p_LoanDurationYears IN NUMBER
) RETURN NUMBER IS
    v_MonthlyInstallment NUMBER;
    v_MonthlyInterestRate NUMBER;
    v_NumberOfPayments NUMBER;
BEGIN
    -- Convert the annual interest rate to a monthly interest rate
    v_MonthlyInterestRate := p_InterestRate / 12 / 100;
    
    -- Calculate the number of monthly payments
    v_NumberOfPayments := p_LoanDurationYears * 12;

    -- Calculate the monthly installment using the formula for an annuity
    v_MonthlyInstallment := (p_LoanAmount * v_MonthlyInterestRate) / 
                            (1 - POWER(1 + v_MonthlyInterestRate, -v_NumberOfPayments));
    
    RETURN v_MonthlyInstallment;
END CalculateMonthlyInstallment;
/
