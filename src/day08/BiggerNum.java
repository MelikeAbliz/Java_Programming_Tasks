package day08;

import java.util.Scanner;

public class BiggerNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter n1: ");
        int n1=sc.nextInt();
        System.out.println("please enter n2: ");
        int n2=sc.nextInt();
        System.out.println("please enter n3: ");
        int n3= sc.nextInt();
        String maxNum=(!(n1==n2||n2==n3||n1==n3))?(n1>n2&&n1>n3)?n1 +" is bigger"
                :(n2>n3&&n2>n1)?n2+" is bigger":n3 +" is bigger":"please enter different number";
        System.out.println(maxNum);

    }
}
/*
write a program that checks for the bigger of 3 numbers.
        you get 3 int variables with DIFFERENT values: n1, n2 and n3
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */