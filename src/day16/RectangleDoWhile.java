package day16;

import java.util.Scanner;

public class RectangleDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String anwser = "yes";
        do {
            System.out.println("Enter the length of the Rectangle:");
            double length = input.nextDouble();
            while (length <= 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(1);
            }
            System.out.println("Enter the width of the Rectangle:");
            double width = input.nextDouble();
            while (width <= 0) {
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(1);
            }
            int area = (int) (width * length);
            int parameter=(int)(width+length)*2;
            System.out.println("Area of rectangle: " + area+ "\nPerimeter of rectangle: "+parameter);
            System.out.println("Would you like to calculate another Rectangle? YES/NO");
            anwser = input.next().toLowerCase();
            while (!(anwser.equals("yes") || anwser.equals("no"))) {
                System.err.println("Invalid anwser!! please re-enter");
                System.err.println("Would you like to calculate another Rectangle? YES/NO");
                anwser = input.next().toLowerCase();
            }
            if (anwser.equals("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
            }
        }while (anwser.equals("yes"));
        input.close();
    }
}
/*
Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if the user enters 0 or negative numbers, terminate the program
                                 after displaying the error message "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if the user enters 0 or negative numbers, terminate the program after displaying
                                the error message "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If the user enters an invalid entry, ask the user to re-enter until the user
                                provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */