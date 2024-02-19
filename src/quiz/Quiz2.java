package quiz;

import java.util.Scanner;

public class Quiz2 {
    /*
        If the number is greater than 90, I want to print only "Number55 is greater than 90"
        But it prints "Number55 is greater than 50" after "Number55 is greater than 90" for numbers greater than 90.
         */
    public static void main(String[] args) {
        int number = 95;

        if (number > 90) {
            System.out.println(number + " is greater than 90");
        }
        if (number > 50) {
            System.out.println(number + " is greater than 50");
        }
    }
    Scanner input=new Scanner(System.in);
    int num1=input.nextInt();
    int num2=input.nextInt();
    void sum(int num1,int num2,int num3){
        int sum=num1+num2+num3;
    }
    int sum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
}
