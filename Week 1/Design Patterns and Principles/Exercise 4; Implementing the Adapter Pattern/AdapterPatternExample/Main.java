interface PaymentProcessor { 
    void processPayment(double amount);        
}

class UPIPaymentGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " processed through UPI.");
    }
}

class UPIAdapater implements PaymentProcessor {
    private UPIPaymentGateway upiGateway;

    public UPIAdapater() {
        this.upiGateway = new UPIPaymentGateway();
    }
    @Override
    public void processPayment(double amount) {
        upiGateway.makePayment(amount);
    }
}

class CreditCardPaymentGateway {
    public void makeTransaction(double amount) {
        System.out.println("Transaction of " + amount + " processed through Credit Card.");
    }
}

class CreditCardAdapter implements PaymentProcessor {
    private CreditCardPaymentGateway cardGateway;

    public CreditCardAdapter() {
        this.cardGateway = new CreditCardPaymentGateway();
    }

    @Override
    public void processPayment(double amount) {
        cardGateway.makeTransaction(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor upi = new UPIAdapater();
        PaymentProcessor card = new CreditCardAdapter();

        upi.processPayment(100.0);
        card.processPayment(100.0);
    }
}

/*

Output:

Payment of 100.0 processed through UPI.
Transaction of 100.0 processed through Credit Card.

*/