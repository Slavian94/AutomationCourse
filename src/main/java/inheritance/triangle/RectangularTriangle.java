package inheritance.triangle;

import inheritance.triangle.Triangle;

public class RectangularTriangle extends Triangle {

    public RectangularTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double calcArea() {
        // Розрахунок площі прямокутного трикутника
        return 0.5 * sideA * sideB;
    }
}
