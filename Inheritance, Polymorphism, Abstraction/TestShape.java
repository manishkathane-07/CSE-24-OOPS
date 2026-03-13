/*
A drawing application is being developed where different shapes can be created.
All shapes share some common properties, so a base class Shape is created with a
method display() to show general shape information.
Two specific shapes, Circle and Rectangle, inherit from the Shape class. Each shape
has its own method to calculate and display its area.
This demonstrates hierarchical inheritance, where multiple subclasses inherit from a
single base class.
*/

class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    void area() {
        double area = 3.14 * 5 * 5;
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Shape {
    void area() {
        int area = 4 * 6;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}