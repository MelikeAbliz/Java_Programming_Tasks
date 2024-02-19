package day15;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double sum=0;
        int i=0;
        while (true){
            System.out.println("please enter a number:");
            double num= input.nextDouble();
        if (num>0) {
            sum+=num;
            i++;
        } else {
                System.err.println("please enter positive number:");
                break;
            }
        }
        System.out.println("your entered: "+i+" times and "+"sum of these entered number is: "+sum);
        input.close();
    }
}
/*
Create a class named UntilNegative and Write a program that
calculates the sum of numbers entered by the user until the user enters a negative number.
 */