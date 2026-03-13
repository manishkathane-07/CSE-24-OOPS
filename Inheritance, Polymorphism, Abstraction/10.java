/*
Create an interface Bank with method getInterestRate(). Create classes SBI,
HDFC, and ICICI that implement the interface and return different interest rates.
Write a Java program to display the interest rate of each bank.
*/

interface Bank {
    int getInterestRate();
}

class SBI implements Bank {
    public int getInterestRate() {
        return 7;
    }
}

class HDFC implements Bank {
    public int getInterestRate() {
        return 8;
    }
}

class ICICI implements Bank {
    public int getInterestRate() {
        return 9;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate: " + b.getInterestRate());

        b = new HDFC();
        System.out.println("HDFC Rate: " + b.getInterestRate());

        b = new ICICI();
        System.out.println("ICICI Rate: " + b.getInterestRate());
    }
}