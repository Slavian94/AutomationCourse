package credit_installment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Installment {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Enter the total credit amount: ");
        double creditAmount = in.nextDouble();
        System.out.print("Enter the month interest: ");
        int monthlyInterest = in.nextInt();

        System.out.println("Сhoose one of the options: " + "\n"
                + "1 - Calculate the number of monthly payments that must be made to fully repay the loan"
                + "\n" + "2 - Calculate the amount of the monthly payment");
        int choosingOption = in.nextInt();

        if (choosingOption == 1) {

            System.out.print("Enter the monthly payment: ");
            double monthlyPayment = in.nextDouble();

            double numerator = -Math.log(1 - (monthlyPayment / (creditAmount * monthlyInterest)));
            double denominator = Math.log(1 + monthlyInterest);
            double  countPayments = numerator / denominator * 0.01;

            System.out.println("The number of monthly payments is equal " + Math.ceil(countPayments));

        } else if (choosingOption == 2) {

            System.out.print("Enter the count payment: ");
            int countyPayments = in.nextInt();

            double monthlyPayment = 0.01 * creditAmount * (monthlyInterest + monthlyInterest /(Math.pow(1 + monthlyInterest, countyPayments) - 1));
            System.out.println("The monthly payment is " + df.format(monthlyPayment));

        } else {

            System.out.println("Such an option does not exist");
        }
    }
}



//3. Розстрочка (20 балів)
//
//        Програма просить користувача обрати один з двух варіантів:
//
//        - Розрахувати кількість щомісячних платежів, які необхідно зробити для повного погашення кредиту (програма просить суму щомісячного взносу)
//
//        - Розрахувати суму щомісячного платежу (програма просить кількість платежів)
//
//        Врахувати, що кожен місяць до залишку по кредиту додається місячний відсоток.
//
//        Приклад:
//
//        сума кредиту 100, місячна ставка 1%. Якщо користувач сплатив 10 в перщому місяці, то в другому місяці залишок кредиту буде складати 90+0.9



