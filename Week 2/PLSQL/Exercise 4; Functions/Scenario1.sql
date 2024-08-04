CREATE OR REPLACE FUNCTION CalculateAge(
    p_DOB IN DATE
) RETURN NUMBER IS
    v_Age NUMBER;
BEGIN
    -- Calculate the age based on the difference between the current date and the date of birth
    v_Age := TRUNC(MONTHS_BETWEEN(SYSDATE, p_DOB) / 12);
    RETURN v_Age;
END CalculateAge;
/
