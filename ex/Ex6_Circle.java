package ex;

public class Ex6_Circle {
    private final double radius;

    public Ex6_Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}