package day16;

import java.util.Scanner;

public class SquareDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String anwser = "yes";
        do {
            System.out.println("Enter the side of the square:");
            double side = input.nextDouble();
            while (side <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(1);
            }
            double area = side * side;
            double perimeter = 4 * side;
            System.out.println("Area of square: " + area + "\nPerimeter of square: " + perimeter);
            System.out.println("Would you like to calculate another Square? YES/NO");
            anwser = input.next().toLowerCase();
            while (!(anwser.equals("yes") || anwser.equals("no"))) {
                System.err.println("Invalid anwser!! please re-enter");
                System.err.println("Would you like to calculate another Square? YES/NO");
                anwser = input.next().toLowerCase();
            }
            if (anwser.equals("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
            }
        }while (anwser.equals("yes"));
        input.close();


    }
}
/*
Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if the user enters 0 or negative numbers, terminate the program after displaying
                                the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */