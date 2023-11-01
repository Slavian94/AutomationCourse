package inheritance.circle;

public class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected static double calcDiameter(double radius){
        return 2 * radius;
    }

    protected static double calculateCircleArea (double radius) {
        double pi = Math.PI;
        return pi * radius * radius;
    }

}
