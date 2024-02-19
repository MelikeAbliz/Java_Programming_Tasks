package day06;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary=130000;
        double taxRate=0;
        boolean isMarried=true;
        if (salary>=130000){
            taxRate=0.35;
        }if (salary>=100000 && salary<130000){
            taxRate=0.3;
        }if (salary>=80000 && salary<100000){
            taxRate=0.25;
        }
        if (salary<80000) {
            taxRate = 0.2;
        }
        if (isMarried){
            taxRate-=0.05;
        }
        double totalTax=salary*taxRate;
        double netIncome=salary*(1-taxRate);
        System.out.println("salary = "+salary);
        System.out.println("total tax = "+totalTax);
        System.out.println("net income = "+netIncome);


    }
}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for a salary of 130K or more
                        30% for a salary of 100K to 129k
                        25% for a salary of 80K to 99K
                        20% for a salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax

 */