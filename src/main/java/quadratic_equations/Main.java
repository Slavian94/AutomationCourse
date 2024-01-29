package quadratic_equations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation ax^2 + bx + c = 0:");

        System.out.print("Input first coefficient: ");
        double firstNumber = input.nextInt();
        System.out.print("Input second coefficient: ");
        double secondNumber = input.nextInt();
        System.out.print("Input third coefficient: ");
        double thirdNumber = input.nextInt();

        QuadraticEquations quadraticEquations = new QuadraticEquations(firstNumber, secondNumber, thirdNumber);
        quadraticEquations.calcEquation();
    }
}
