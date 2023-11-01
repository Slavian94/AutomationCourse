package inheritance.quadrangle;

public class Trapezium extends Quadrangle {
    public Trapezium(double sideA, double sideB, double sideC, double sideD, double angleA) {
        super(sideA, sideB, sideC, sideD, angleA);
    }
    @Override
    public double calcArea() {
        //Розрахунок площі трапеції
        return sideA * sideB / 2 * Math.sqrt(sideC * sideC - ((sideA - sideB)* (sideA - sideB) + 2 *(sideA - sideB)));
    }
}
