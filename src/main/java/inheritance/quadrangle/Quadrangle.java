package inheritance.quadrangle;

public class Quadrangle {

    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;

    protected double angleA;
    protected double angleB;
    protected double angleC;
    protected double angleD;

    public Quadrangle(double sideA, double sideB, double sideC, double sideD, double angleA) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.angleA = angleA;
    }

    public double calcArea() {
        // Розрахунок площі для загального чотирикутника
        return 0.0;
    }

    public double calcPerimeter() {
        // Розрахунок периметру для загального чотирикутника
        return sideA + sideB + sideC + sideD;
    }
}
