/*
13. Student Input System
Create a class StudentInputSystem. Accept student age fromuser. Handle invalid input using multiple catch blocks such as
InputMismatchException and ArithmeticException.
Output: If valid: 'Student age is: <age>' Else: 'Invalid input'
*/
import java.util.*;

class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            System.out.println("Student age is: " + age);
        } catch(InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}