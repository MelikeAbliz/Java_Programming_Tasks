package day09;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the radius of the circle: ");
        double radius=input.nextDouble();
        double area=3.14*radius*radius;
        double perimeter=2*3.14*radius;
        System.out.println("the area of the circle is: "+area+"\nthe perimeter of the circle is: "+perimeter);
    }
}
/*
1.1 Ask the user to enter the radius of the circle
1.1 Calculate the area and perimeter of the circle by using the radius

 */