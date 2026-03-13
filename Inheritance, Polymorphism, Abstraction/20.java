/*
A company wants to clearly assign constructor parameters to object variables.Question:
Create a class Employee with variables name and salary.
Use this keyword inside the constructor to initialize object variables.
Display employee details.
*/

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul",50000);
        e1.display();
    }
}