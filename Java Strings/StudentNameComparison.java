/*
3. Define a class StudentNameComparison.
● Accept two student names.
● Compare them using case-sensitive comparison.● Compare them using case-insensitive comparison.
● Display appropriate message.
*/

import java.util.*;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String n1 = sc.nextLine();
        System.out.print("Enter second name: ");
        String n2 = sc.nextLine();

        if(n1.equals(n2))
            System.out.println("Same (Case-Sensitive)");
        else
            System.out.println("Different (Case-Sensitive)");

        if(n1.equalsIgnoreCase(n2))
            System.out.println("Same (Case-Insensitive)");
        else
            System.out.println("Different (Case-Insensitive)");
    }
}