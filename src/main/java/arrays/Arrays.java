package arrays;

import static java.util.Arrays.*;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers = new int[args.length];

        int temp;

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        System.out.print("Base array: ");
        printArray(numbers);

        sort(numbers);
        System.out.print("Asc sorted array: ");
        printArray(numbers);

        // реалізовано одним методом, так як додумався сортувати в останньому завданні тільки після сортування Desk
        innerAndDeskSort(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int num: numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void innerAndDeskSort(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.print("Desc sorted array: ");
        printArray(numbers);

        for (int k = 1; k < numbers.length ; k++) {
            for (int i = k; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.print("Inner sorted array: ");
        printArray(numbers);
    }
}
