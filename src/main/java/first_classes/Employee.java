package first_classes;

import java.math.BigDecimal;

public class Employee {

    private String lastName;
    private String firstName;
    private String position;
    private BigDecimal salaryForHour;

    public Employee(String lastName, String firstName, String position, BigDecimal salaryForHour) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.salaryForHour = salaryForHour;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalaryForHour() {
        return salaryForHour;
    }

    public void setSalaryForHour(BigDecimal salaryForHour) {
        this.salaryForHour = salaryForHour;
    }

    // метод для виводу інформації по працівнику
    public void printEmployeeDetails() {
        System.out.println("Прізвище: " + lastName);
        System.out.println("Ім'я: " + firstName);
        System.out.println("Посада: " + position);
        System.out.println("Заробітня платня за годину: $" + salaryForHour);
    }
    // метод для виводу заробітної плати за місяць
    public BigDecimal calculateMonthlySalary(int hoursWorkedPerMonth) {
        return salaryForHour.multiply(BigDecimal.valueOf(hoursWorkedPerMonth));
    }
    // метод перевірки чи є працівник тестувальником
    public boolean isQa() {
        return position.equalsIgnoreCase("QA");
    }






}
