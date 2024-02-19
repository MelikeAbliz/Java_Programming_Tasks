package day04;

import java.util.Scanner;

public class SwapToVariable2 {
    public static void main(String[] args) {

    Scanner value=new Scanner(System.in);
        System.out.println("please enter a value: ");
    int a= value.nextInt();
        System.out.println("please enter b value: ");
    int b= value.nextInt();
        System.out.println("before swap: "+"a= "+a+", "+"b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap: "+"a= "+a+", "+"b= "+b);
    }
}
