package day04;

import java.util.Scanner;

public class KilosToPounds {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the kilos: ");
        double kilos= input.nextDouble();
        double lb=2.2;
        double pounds=kilos*lb;
        System.out.println(kilos+" kilos is equal to "+pounds+" pounds.");
    }
}
