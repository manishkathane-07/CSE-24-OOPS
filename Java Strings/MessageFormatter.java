/*
4. Create a class MessageFormatter.
● Accept first name and last name.
● Concatenate both names with space.
● Display full name in proper format.
*/


import java.util.*;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Name: ");
        String f = sc.nextLine();
        System.out.print("Last Name: ");
        String l = sc.nextLine();

        String full = f + " " + l;
        System.out.println("Full Name: " + full);
    }
}