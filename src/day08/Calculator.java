package day08;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter n1: ");
        double n1= sc.nextDouble();
        System.out.println("please enter n1: ");
        double n2= sc.nextDouble();
        char mathOperator = '/';

        switch (mathOperator){
            case'+' :
                System.out.println("n1 + n2= "+(n1+n2));
                break;
            case'-':
                System.out.println("n1 - n2= "+(n1-n2));
                break;
            case '*':
                System.out.println("n1 * n2= "+(n1*n2));
                break;
            case '/':
                System.out.println("n1 / n2= "+(n1/n2));
                break;
            case'%':
                System.out.println("n1 % n2= "+(n1%n2));
                break;
            default:
                System.out.println("invalid operator");
        }

    }
}
/*
given two double variables named n1 & n2, and a char variable named mathOperator,
write a program that can calculate the result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

		Note: MUST use the switch statement

 */