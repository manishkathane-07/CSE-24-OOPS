/*
A company wants to evaluate employee performance.
Create an abstract class Employee with:
1. attributes: name, id
2. abstract method calculateBonus()
Create subclasses:
3. Manager → bonus is 20% of salary
4. Developer → bonus is 10% of salary plus project incentive
Demonstrate runtime polymorphism by storing different employee objects in an
Employee reference and calling calculateBonus().
*/

abstract class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;

    Manager(String n, int i, double s) {
        super(n, i);
        salary = s;
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    double salary, incentive;

    Developer(String n, int i, double s, double inc) {
        super(n, i);
        salary = s;
        incentive = inc;
    }

    double calculateBonus() {
        return salary * 0.10 + incentive;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee e;

        e = new Manager("Rahul",101,50000);
        System.out.println("Manager Bonus = " + e.calculateBonus());

        e = new Developer("Amit",102,40000,5000);
        System.out.println("Developer Bonus = " + e.calculateBonus());
    }
}