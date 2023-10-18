package math_operation_task1;

import java.util.Scanner;
public class MathOperation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int num1 = in.nextInt();
        System.out.print("Input a first number: ");
        int num2 = in.nextInt();
        int st = (int) Math.pow(num1, num2);
        System.out.println(st);

    }
}
