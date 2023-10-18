package calc_tax_first;

import java.util.Scanner;

public class CalcTax {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть кількість робочих годин за тиждень: ");
        int quantityHours = in.nextInt();
        System.out.print("Введіть вартість однієї години роботи: ");
        int costHours = in.nextInt();
        System.out.print("Введіть відсоток податку: ");
        int interestTaz = in.nextInt();

        double monthSalaryWithoutTax = 4 * quantityHours * costHours;
        double monthSalaryWithTax = monthSalaryWithoutTax - ((monthSalaryWithoutTax * interestTaz) / 100);
        double yearSalaryWithoutTax = monthSalaryWithoutTax * 12;
        double yearSalaryWithTax = monthSalaryWithTax * 12;

        System.out.println("Зарплатня на місяць без податків: " + monthSalaryWithoutTax + "\n" +
                "Зарплатня на місяць з податками: " + monthSalaryWithTax + "\n" +
                "Зарплатня на рік без податків: " + yearSalaryWithoutTax + "\n" +
                "Зарплатня на рік з податками: " + yearSalaryWithTax);
    }
}
