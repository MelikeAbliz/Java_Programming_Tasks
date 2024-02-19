package week02;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 0;
        double federalTaxRate = 26;


        stateTaxRate = stateTaxRate / 100; //0.08
        federalTaxRate = federalTaxRate / 100;   //0.26


        double salaryBeforeTax = hourlyRate * weeklyHours * 52;  // 100_000
        double stateTax = salaryBeforeTax * stateTaxRate; // 8000
        double federalTax = salaryBeforeTax * federalTaxRate; // 26000
        double totalTax = federalTax + stateTax; //34000
        double salaryAfterTax = salaryBeforeTax - totalTax; //66000


        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        //  System.out.println("Total tax is: $" + Math.round(totalTax) );
        System.out.println("Total tax is: $" + totalTax );
        System.out.println("Net income is: $"+salaryAfterTax);

    }
}
/*
Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

     Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
                    Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                    Net income is: $79560
 */