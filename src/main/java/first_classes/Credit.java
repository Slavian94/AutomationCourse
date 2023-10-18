package first_classes;

import java.math.BigDecimal;

public class Credit {

    String creditBank;
    BigDecimal creditBody;
    int quantityMonths;
    int creditInterest;


    public Credit(String creditBank, BigDecimal creditBody, int quantityMonths, int creditInterest, BigDecimal minPayment) {
        this.creditBank = creditBank;
        this.creditBody = creditBody;
        this.quantityMonths = quantityMonths;
        this.creditInterest = creditInterest;
    }

    public String getCreditBank() {
        return creditBank;
    }

    public void setCreditBank(String creditBank) {
        this.creditBank = creditBank;
    }

    public BigDecimal getCreditBody() {
        return creditBody;
    }

    public void setCreditBody(BigDecimal creditBody) {
        this.creditBody = creditBody;
    }

    public int getQuantityMonths() {
        return quantityMonths;
    }

    public void setQuantityMonths(int quantityMonths) {
        this.quantityMonths = quantityMonths;
    }

    public int getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(int creditInterest) {
        this.creditInterest = creditInterest;
    }

// розрахунок щомісячного платежу
    public BigDecimal getMonthPayment(){
        BigDecimal monthPayment = creditBody.divide(BigDecimal.valueOf(quantityMonths));
        return monthPayment;
    }
// розрахунок мінімального першого внеску
    public BigDecimal getMinFirstPayment() {
        BigDecimal minFirstPayment = getMonthPayment().multiply(BigDecimal.valueOf(creditInterest/100));
        return minFirstPayment;
    }
}
