package inheritance.quadrangle;

public class Rhombus extends Quadrangle {
    public Rhombus(double sideA, double sideB, double sideC, double sideD, double angleA) {
        super(sideA, sideB, sideC, sideD, angleA);
    }

    @Override
    public double calcArea() {
        return sideA * sideA * Math.sin(angleA) ;
    }

    @Override
    public double calcPerimeter() {
        //Розрахунок периметру ромба
        return sideA * 4;
    }
}
