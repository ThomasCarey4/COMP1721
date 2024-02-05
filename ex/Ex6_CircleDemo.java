package ex;

public class Ex6_CircleDemo {
    public static void main(String[] args) {
        Ex6_Circle c1 = new Ex6_Circle(4.5);
        System.out.printf("Radius: %.1f\n", c1.getRadius());
        System.out.printf("Perimeter: %.3f\n", c1.perimeter());
        System.out.printf("Area: %.3f\n", c1.area());
    }
}
