package day08;

public class Loans {
    public static void main(String[] args) {
        int salary=50000;
        int creditScore=650;
        String loan=(salary>=60000&&creditScore>=650)?"Loan Approved":"Loan Denied";
        System.out.println(loan);

    }
}
/*
given two variables, salary and credit score, use the given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */