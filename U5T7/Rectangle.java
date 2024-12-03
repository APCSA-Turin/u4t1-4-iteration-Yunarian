
public class Rectangle {
    // instance variables
    private double length;
    private double width;

    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // STATIC "utility" method that converts feet to inches
    public static double feetToInches(double feet) {
        return feet * 12;
    }

    // STATIC "utility" method that converts inches to feet
    public static double inchesToFeet(double inches) {
        return (inches / 12.0);
    }

    // instance method that returns area of Rectangle object
    public double area() {
        return length * width;
    }

    // instance method that returns the perimeter of a Rectangle object.
    public double perimeter() {
        return 2 * length + 2 * width;
    }
}
