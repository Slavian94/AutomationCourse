package first_classes;

public class Triangle {

    double angleA;
    double angleB;
    double angleC;
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double angleA, double angleB, double angleC, double sideA, double sideB, double sideC) {
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getAngleA() {
        return angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public double getAngleC() {
        return angleC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    public double getSquare() {
        double angleBInRadians = Math.toRadians(angleB);
        double sinAngleB = Math.sin(angleBInRadians);
        double square = 1/2 * sideA * sideB * sinAngleB;
        return square;
    }
}
