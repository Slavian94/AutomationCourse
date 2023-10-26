package calc_salary;


import java.text.DecimalFormat;

public class Salary {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");
        double costHour = Double.parseDouble(args[0]);
        double taxInterest = Double.parseDouble(args[1]) / 100;
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        double totalSalaryWithTax = 0;
        double totalSalaryWithoutTax = 0;


        for (int i = 0; i < months.length; i++) {

            double monthSalaryWithoutTax = 8 * costHour * calculateWorkingDays(i);
            double monthSalaryWithTax = monthSalaryWithoutTax * (1 - taxInterest);

            totalSalaryWithoutTax += monthSalaryWithoutTax;
            totalSalaryWithTax += monthSalaryWithTax;

            System.out.println(months[i] + " " + df.format(monthSalaryWithTax) + " " + df.format(monthSalaryWithoutTax));
        }
        System.out.println("Total: " + df.format(totalSalaryWithTax) + " " + df.format(totalSalaryWithoutTax));

    }

    public static int calculateWorkingDays(int month) {

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int workingDays = (5 * (daysInMonth[month] / 7)) + (daysInMonth[month] % 7);
        return  workingDays;
    }


}
