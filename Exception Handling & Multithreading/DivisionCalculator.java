/*
12. Online Division Calculator
Create a class DivisionCalculator. Accept two integers from
user. Perform division operation. Handle division by zero using
try-catch.
Output: If valid: 'Result: <value>' Else: 'Cannot divide by zero'
*/

import java.util.*;

class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println("Result: " + (a/b));
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}