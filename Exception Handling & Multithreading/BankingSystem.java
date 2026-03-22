/*
22. Banking System
Create a class BankingSystem. Multiple threads access shared
account balance using synchronized block.
Output: Balance deduction messages.
*/

class BankingSystem {
    int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println("Withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();

        Thread t1 = new Thread(() -> b.withdraw(700));
        Thread t2 = new Thread(() -> b.withdraw(500));

        t1.start();
        t2.start();
    }
}