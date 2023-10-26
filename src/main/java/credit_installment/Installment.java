package credit_installment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Installment {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Enter the total credit amount: ");
        double creditAmount = in.nextDouble();

        System.out.print("Enter the monthly interest rate (in percentage): ");
        double monthlyInterest = in.nextDouble() / 100;

        System.out.println("Choose one of the options: " + "\n"
                + "1 - Calculate the number of monthly payments needed to fully repay the loan"
                + "\n" + "2 - Calculate the amount of the monthly payment");
        int choosingOption = in.nextInt();

        if (choosingOption == 1) {

            System.out.print("Enter the monthly payment: ");
            double monthlyPayment = in.nextDouble();

            double numerator = -Math.log(1 - (monthlyPayment / (creditAmount * monthlyInterest)));
            double denominator = Math.log(1 + monthlyInterest);
            double countPayments = numerator / denominator;

            System.out.println("The number of monthly payments is: " + Math.ceil(countPayments));

        } else if (choosingOption == 2) {

            System.out.print("Enter the number of payments: ");
            int numberOfPayments = in.nextInt();

            double monthlyPayment = creditAmount * (monthlyInterest + monthlyInterest /(Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
            System.out.println("The monthly payment is: " + df.format(monthlyPayment));

        } else {

            System.out.println("Such an option does not exist");
        }

        in.close();
    }
}
