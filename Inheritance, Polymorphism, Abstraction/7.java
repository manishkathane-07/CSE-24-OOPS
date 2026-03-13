/*
Create an abstract class Shape with an abstract method calculate_area() and a
concrete method display_info(). Create concrete subclasses
like Circle and Rectangle that must implement their own specific logic
for calculate_area(). Try to instantiate an object of the Shape class directly and
observe the compilation error. Use the subclass objects to call both abstract and
concrete methods.
*/

abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("Shape Information");
    }
}

class Circle extends Shape {
    void calculate_area() {
        System.out.println("Area of Circle = " + (3.14 * 5 * 5));
    }
}

class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display_info();
        c.calculate_area();
    }
}