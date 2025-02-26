package Abstraction;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {
        return length*width;
    }
    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor()
                + "and area is : " + area();
    }

}
