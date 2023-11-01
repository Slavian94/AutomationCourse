package inheritance.quadrangle;

public class Rectangle extends Quadrangle {
    public Rectangle(double sideA, double sideB, double sideC, double sideD, double angleA) {
        super(sideA, sideB, sideC, sideD, angleA);
    }

    @Override
    public double calcArea(){
        // Розрахунок площі прямокутника
        return sideA * sideB;
    }

    @Override
    public double calcPerimeter(){
        // Розрахунок периметру прямокутника
        return 2 * sideA + 2 * sideB;
    }
}
