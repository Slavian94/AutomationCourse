package quadratic_equations;

import lombok.Getter;

import java.text.DecimalFormat;


public class QuadraticEquations {

    private double firstCoefficient, secondCoefficient, thirdCoefficient;
    @Getter
    private double firstRoot, secondRoot, root;

    public QuadraticEquations(double firstCoefficient, double secondCoefficient, double thirdCoefficient) {
        this.firstCoefficient = firstCoefficient;
        this.secondCoefficient = secondCoefficient;
        this.thirdCoefficient = thirdCoefficient;
    }
    DecimalFormat df = new DecimalFormat("#.##");

    private double calcDiscriminant() {
       return secondCoefficient * secondCoefficient - 4 * firstCoefficient * thirdCoefficient;
    }

    public void calcEquation() {
        double discriminant = calcDiscriminant();

        if (discriminant > 0) {
            firstRoot = (-secondCoefficient + Math.sqrt(discriminant))/(2 * firstCoefficient) ;
            secondRoot = (-secondCoefficient - Math.sqrt(discriminant))/(2 * firstCoefficient) ;
            System.out.println("Equation " + firstCoefficient + "x^2 + " + secondCoefficient + "x" + " + "
                    + thirdCoefficient + " = 0" + " has roots:");
            System.out.println("x1 = " + df.format(firstRoot));
            System.out.println("x2 = " + df.format(secondRoot));
        } else if (discriminant == 0) {
            root = -secondCoefficient / (2 * firstCoefficient);
            System.out.println("Equation " + firstCoefficient + "x^2 + " + secondCoefficient + "x" + " + "
                    + thirdCoefficient + " = 0" + " has roots:");
            System.out.println("x1 = " + df.format(root));
        } else if (discriminant < 0) {
            System.out.println("Equation " + firstCoefficient + "x^2 + " + secondCoefficient + "x" + " + "
                    + thirdCoefficient + " = 0" + " hasn't real roots");
            throw new UnsupportedOperationException("Complex roots are not supported");
        }
    }
}
