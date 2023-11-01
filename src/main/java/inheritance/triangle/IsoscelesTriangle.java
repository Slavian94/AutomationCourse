package inheritance.triangle;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double calcArea() {
        // Розрахунок площі рівнобедренного трикутника
        double height = Math.sqrt(sideB * sideB - (sideA * sideA / 4));
        return 0.5 * sideA * height;
    }

    public double calcPerimeter(){
        // Розрахунок периметру рівнобедренного трикутника
        return  2 * sideB + sideA;
    }
}
