package day04;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter side number of square: ");
        double side= input.nextDouble();
        double area=side*side;
        double perimeter=4*side;
        System.out.println("the area of the square is: "+area+"\nthe perimeter of the square is: "+perimeter);
    }
}
