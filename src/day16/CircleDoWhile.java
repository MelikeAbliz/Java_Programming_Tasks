package day16;

import java.util.Scanner;

public class CircleDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String anwser = "yes";
        do {
            System.out.println("Enter the radius of the circle: ");
            double radius = input.nextDouble();
            while (radius <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(1);
            }
            double diameter = 2 * radius;
            double area = 3.14 * radius * radius;
            double perimeter = 2 * 3.14 * radius;
            System.out.println("Diameter of circle: " + diameter + "\nArea of circle: " + area + "\nPerimeter of a circle: " + perimeter);
            System.out.println("Would you like to calculate another circle?");
            anwser = input.next().toLowerCase();
            while (!(anwser.equals("yes") || anwser.equals("no"))) {
                System.err.println("Invalid anwser!! please re-enter");
                System.err.println("Would you like to calculate another circle? YES/NO");
                anwser = input.next().toLowerCase();
            }
            if (anwser.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
            }
        } while (anwser.equals("yes"));
        input.close();
    }
}
/*
Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if the user enters 0 or negative numbers, terminate the program
                                after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of a circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */