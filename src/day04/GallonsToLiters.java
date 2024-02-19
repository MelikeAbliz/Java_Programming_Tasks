package day04;

import java.util.Scanner;

public class GallonsToLiters {
    public static void main(String[] args) {
//        convert any number of gallons to liters
        Scanner input=new Scanner(System.in);
        System.out.println("please input number of gallons: ");
        double gallon=input.nextDouble();
        double liters=gallon*3.79;
        System.out.println(gallon+" gallons is equal to "+liters+" liters.");

    }
}
