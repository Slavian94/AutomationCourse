package inheritance.quadrangle;

public class Parallelogram extends Quadrangle {

    public Parallelogram(double sideA, double sideB, double sideC, double sideD, double angleA) {
        super(sideA, sideB, sideC, sideD, angleA);
    }

    @Override
    public double calcArea(){
        // Розрахунок площі паралелограма
        return sideA * sideB;
    }

    @Override
    public double calcPerimeter(){
        // Розрахунок периметру паралелограма
        return 2 * sideA + 2 * sideB;
    }
}
