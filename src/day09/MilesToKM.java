package day09;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter miles: ");
        double miles= input.nextDouble();
        double KM=miles*1.609344;
        System.out.println(miles+" miles equal to "+ KM+ " kilometers");
    }
}
/*
Create a class named MilesToKM, and write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */