package figures;

import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int width = 0;
        int height = 0;

        while (true) {
            System.out.println("Enter a name for the shape (rectangle - r, right triangle - rt, " +
                    "inverted right triangle - irt, isosceles triangle - it): ");
            String figure = in.nextLine();

            if (figure.equals("r")) {
                width = Integer.parseInt(args[0]);
                height = Integer.parseInt(args[1]);
                for (int i = 0; i < height; i++) {
                    for (int j = 1; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
            } else if (figure.equals("rt")) {
                height = Integer.parseInt(args[2]);
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            } else if (figure.equals("irt")) {
                height = Integer.parseInt(args[2]);
                for (int i = 1; i <= height; i++) {
                    for (int j = height; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int y = 1; y <= i; y++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (figure.equals("it")) {
                height = Integer.parseInt(args[2]);

                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= height - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k < 2 * i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Such a figure is not in the list!");
            }
            System.out.println("Do you what to continue drawing? (yes/no) ");
            String continueDraw = in.nextLine();
            if (continueDraw.equals("no")) {
                System.out.println("Good Bye!");
                break;
            }
        }
    }
}