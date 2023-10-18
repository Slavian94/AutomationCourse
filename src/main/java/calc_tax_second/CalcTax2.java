package calc_tax_second;

import java.util.Scanner;

public class CalcTax2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введіть кількість робочих годин за тиждень: ");
        int quantityHours = in.nextInt();
        System.out.print("Введіть суму річної зарплатні з податками: ");
        int yearSalaryWithTax = in.nextInt();
        System.out.print("Введіть відсоток податку: ");
        int interestTaz = in.nextInt();

        double yearSalaryWithoutTax = (yearSalaryWithTax * 100)/(100 - interestTaz);
        double weekSalaryWithoutTax = yearSalaryWithoutTax / 48;
        double costHour = weekSalaryWithoutTax / quantityHours;
        System.out.println("При " + quantityHours + " робочих годин на тиждень з річною зарплатею в сумі " +
                yearSalaryWithTax + " та податком " + interestTaz +"% година часу коштує " + costHour);
    }
}
