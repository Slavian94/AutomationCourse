package if_else_constructions_task2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Constructions2 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть вартість товару за одиницю: ");
        double price = in.nextDouble();
        System.out.print("Введіть кількість товару: ");
        int quantity = in.nextInt();

        double purchaseAmount = price * quantity;
        double purchaseAmountWithDiscount;

        if (quantity > 80) {
            purchaseAmountWithDiscount = purchaseAmount - (purchaseAmount * 0.13);
            System.out.println("Сума покупки дорівнює: " + df.format(purchaseAmountWithDiscount));

        } else if (quantity > 30) {
            purchaseAmountWithDiscount = purchaseAmount - (purchaseAmount * (0.12 + ((quantity - 30) / 10) * 0.004));
            System.out.println("Сума покупки дорівнює: " + df.format(purchaseAmountWithDiscount));

        } else if (quantity > 20) {
            purchaseAmountWithDiscount = purchaseAmount - (purchaseAmount * 0.1);
            System.out.println("Сума покупки дорівнює: " + df.format(purchaseAmountWithDiscount));

        } else if (quantity > 10) {
            purchaseAmountWithDiscount = purchaseAmount - (purchaseAmount * 0.05);
            System.out.println("Сума покупки дорівнює: " + df.format(purchaseAmountWithDiscount));
        }

    }
}
