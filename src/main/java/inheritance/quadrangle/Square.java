package inheritance.quadrangle;

public class Square extends Quadrangle {
    public Square(double sideA, double sideB, double sideC, double sideD, double angleA) {
        super(sideA, sideB, sideC, sideD, angleA);
    }

    @Override
    public double calcArea() {
        //Розрахунок площі квадрату
        return sideA * sideA;
    }
    @Override
    public double calcPerimeter() {
        //Розрахунок периметру квадрату
        return sideA * 4;
    }
}
