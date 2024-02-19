package day17;

public class SalaryCalculator {
    public double hourlyRate ,
            stateTaxRate ,
            federalTaxRate,
            weeklyHours ,
            salary,
            stateTax,
            federalTax,
            salaryAfterTax;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
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
4. Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage,
            you will be responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in a print statement,
            	it should display the salary, stateTax, federalTax, salaryAfterTax of the Object

 */