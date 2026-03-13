/*
A company wants to track how many employees have been created in the
system.
Question:
Create a class Employee with attributes name and id.
Use a static variable employeeCount that increases every time a new object is
created.
Write a program that:
1. Creates multiple employee objects
2. Displays the total number of employees using a static method
*/

class Employee {
    String name;
    int id;
    static int employeeCount = 0;

    Employee(String n, int i) {
        name = n;
        id = i;
        employeeCount++;
    }

    static void displayCount() {
        System.out.println("Total Employees = " + employeeCount);
    }

    public static void main(String[] args) {
        new Employee("Rahul",1);
        new Employee("Amit",2);
        new Employee("Priya",3);

        Employee.displayCount();
    }
}