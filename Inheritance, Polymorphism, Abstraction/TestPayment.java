/*
Design a payment processing system.
Create an abstract class Payment with an abstract method pay(double amount).
Create subclasses:
 CreditCardPayment
 UPIPayment
 NetBankingPayment
Each subclass should implement the pay() method differently.
*/

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking");
    }
}

public class TestPayment {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay(2000);

        p = new UPIPayment();
        p.pay(1500);

        p = new NetBankingPayment();
        p.pay(3000);
    }
}