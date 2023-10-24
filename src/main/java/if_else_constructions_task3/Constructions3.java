package if_else_constructions_task3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Constructions3 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть номер місяця: ");
        int monthNumber = in.nextInt();
        System.out.print("Введіть вартість однієї години роботи: ");
        double costHours = in.nextDouble();
        System.out.print("Введіть відсоток податку: ");
        double interestTax = in.nextDouble();

        int workingDays = calculateWorkingDays(monthNumber);

        double salaryWithoutTax = costHours * 8 * workingDays;
        double salaryWithTax = salaryWithoutTax - (salaryWithoutTax * interestTax / 100);
        System.out.println("Заробітня плата без податків становить: " + df.format(salaryWithoutTax)
                + "\n" + "Заробітня плата з податками становить: " + df.format(salaryWithTax));
    }

    public static int calculateWorkingDays(int monthNumber) {
        int daysInMonth = 0;
        if (monthNumber > 0 && monthNumber < 13) {
            switch (monthNumber) {
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    daysInMonth = 28;
                    break;
                default:
                    daysInMonth = 31;
            }
        } else {
            System.out.println("Такого номеру місяця не існує. Введіть від 1 до 12!");
        }
        daysInMonth = (5 * (daysInMonth / 7)) + (daysInMonth % 7) ;
        return daysInMonth ;
    }
}
