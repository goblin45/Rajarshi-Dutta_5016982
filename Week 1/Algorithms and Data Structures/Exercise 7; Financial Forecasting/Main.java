class FinancialForecasting {
    public double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue; // base case
        }
        // recursive case
        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }
}

public class Main {
    public static void main(String[] args) {
        FinancialForecasting f = new FinancialForecasting();

        double presentValue = 1000; // Initial investment
        double growthRate = 0.05; // 5% annual growth rate
        int years = 10; // Number of years

        double futureValue = f.calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("The future value of the investment is: %.2f%n", futureValue);
    }
}

/*
 
Output:

The future value of the investment is: 1628.89

*/