package ex;

public class Ex7_Circle {
    private final double radius;

    Ex7_Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid radius: " + radius + " (must be > 0)");
        }
        this.radius = radius;
    }

    static Ex7_Circle Circle() {
        return new Ex7_Circle(1.0);
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

    @Override public String toString() {
        return String.format("Circle(radius=%.4f)", radius);
    }

    @Override public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Ex7_Circle other = (Ex7_Circle) obj;
        return this.radius > (other.radius - 0.00005)
                || this.radius < (other.radius + 0.00005);
    }
}
