package day15;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        positiveNegative();
    }
    public static void positiveNegative(){
        int positive=0;
        int negative=0;
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println("please enter a number");
            int num=input.nextInt();
          if (num>0){
               positive++;
           } else if (num<0) {
               negative++;
           }else{
              System.out.println(num=0);
          }
        }
        System.out.println(positive+" positive "+"and "+negative+" negative");


        System.out.println("----------------------------------------");//use ternary

        for (int i = 0; i <5 ; i++) {
            System.out.println("please enter a number");
            int n=input.nextInt();
            positive = (n > 0) ? ++positive : positive;
            negative = (n < 0) ? ++negative : negative;
        }
        System.out.println(positive+" positive and "+negative+" negative");
            input.close();


    }
}
/*
Create a class named PositiveNegative and write a program
that asks the user to enter a number for 5 times, and print how many positive
and negative numbers the user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */