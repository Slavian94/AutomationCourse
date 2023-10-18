package if_else_constructions_task1;

import java.util.Scanner;
public class Constructions1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int numberToCheck = in.nextInt();

        if (numberToCheck % 2 == 0) {
            System.out.println(numberToCheck + " is even number!");
        } else {
            System.out.println(numberToCheck + " - is odd number!");
        }
        if (numberToCheck > 0) {
            System.out.println(numberToCheck + " - is positive number!");
        } else {
            System.out.println(numberToCheck + " - is negative number!");
        }
        if (isPrime(numberToCheck)) {
            System.out.println(numberToCheck + " - is prime number!");
        } else {
            System.out.println(numberToCheck + " - is composite number!");
        }
    }
    // Метод для визначення простих та складних чисел
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
