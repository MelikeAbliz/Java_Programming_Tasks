package day25;

public class SalaryCalculator {
//    look at day 17.Salary Calculator

    public double hourlyRate ,
            stateTaxRate ,
            federalTaxRate,
            weeklyHours ,
            salary,
            stateTax,
            federalTax,
            salaryAfterTax;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        salary=hourlyRate * weeklyHours * 52;
        return salary;
    }
    public double stateTax(){
        stateTax = salary * stateTaxRate / 100 ;
        return  stateTax;
    }
    public double federalTax(){
        federalTax=salary*federalTaxRate/100;
        return federalTax;
    }
    public double salaryAfterTax(){
        double totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;
        return salaryAfterTax;
    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary +
                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", salaryAfterTax=" + salaryAfterTax +
                '}';
    }
}
/*
Create a custom class named SalaryCalculator:
        1.1 Create a class named SalaryCalculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */