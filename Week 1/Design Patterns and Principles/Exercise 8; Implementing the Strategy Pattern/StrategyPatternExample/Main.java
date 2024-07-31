interface PaymentStrategy {
    void pay(double amount);
}

class PaymentContext {
    protected PaymentStrategy paymentStrategy;
    void execeuteStrategy() {
        paymentStrategy.pay(100);
    };
}

class CreditCardPayment implements PaymentStrategy {
    @Override 
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.paymentStrategy = new CreditCardPayment();
        paymentContext.execeuteStrategy();

        paymentContext.paymentStrategy = new PayPalPayment();
        paymentContext.execeuteStrategy();
    }
}

/* 

Output:

Paying 100.0 using Credit Card
Paying 100.0 using PayPal


*/