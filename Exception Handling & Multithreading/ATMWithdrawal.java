/*
11. ATM Withdrawal System
Create a class ATMWithdrawal. Accept account balance andwithdrawal amount from the user. If withdrawal amount is
greater than balance, throw an exception manually using throw.
Otherwise deduct amount and display updated balance.
Output: If sufficient balance: 'Withdrawal successful.
Remaining balance: <balance>' Else: 'Insufficient Balance'
*/

import java.util.*;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

        try {
            if(withdraw > balance)
                throw new Exception("Insufficient Balance");

            balance -= withdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}