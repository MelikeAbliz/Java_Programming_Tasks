package day04;

import java.util.Scanner;

public class SwapToVariables {
    public static void main(String[] args) {
       /*
        int x=10, y=15;
        System.out.println("before swap: ");
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        int z=x;x=y;y=z;
       System.out.println("after swap: ");
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        */
        Scanner number=new Scanner(System.in);
        System.out.println("please enter x value: ");
        int x= number.nextInt();
        System.out.println("please enter y value: ");
        int y= number.nextInt();
        System.out.println("before swap");
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        int z=x;x=y;y=z;
        System.out.println("after swap: ");
        System.out.println("x= "+x);
        System.out.println("y= "+y);

    }
}