package inheritance.triangle;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double calcArea() {
        // Розрахунок площі рівностороннього трикутника
        return (Math.sqrt(3) / 4) * sideA * sideA;
    }


    public double calcPerimeter(){
        // Розрахунок периметру рівностороннього трикутника
        return 3 * sideA;
    }
}
