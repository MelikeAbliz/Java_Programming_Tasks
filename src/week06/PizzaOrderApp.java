package week06;

import java.util.Scanner;

public class PizzaOrderApp {
    static Scanner input = new Scanner(System.in);  // Global Variable

    public static void main(String[] args) {
        //step1
        System.out.println("\tWelcome to Cydeo Pizza House\n\tWould you like to order a pizza?");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) { // while the answer is invalid
            System.err.println("Invalid entry, please enter 'yes' or 'no':");
            answer = input.next().toLowerCase();
        }

        if (answer.equals("no")) { // if the answer is no
            System.out.println("Thanks for using our service!");
            return;
        }
        // Step2:
        System.out.println("Enter the size of the pizza (small, medium, or large):");
        String size = input.next().toLowerCase();

        while( !(size.equals("small") || size.equals("medium") || size.equals("large")) ){
            System.err.println("Invalid entry, please enter 'small' or 'medium' or 'large':");
            size = input.next().toLowerCase();
        }


        // Step 3:
        System.out.println("Enter the number of cheese toppings:");
        int cheeseTopping = input.nextInt();
        cheeseTopping = verifyToppings(cheeseTopping, "cheese");

        System.out.println("Enter the number of peperoni toppings:");
        int peperoniTopping = input.nextInt();
        peperoniTopping = verifyToppings(peperoniTopping, "peperoni");
        // Step 4:
        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();
        while(quantity <= 0){
            System.err.println("Invalid entry, please re-enter the number of quantity:");
            quantity = input.nextInt();
        }


        // Step 5:
        Pizza order = new Pizza();
        order.setInfo(size, cheeseTopping, peperoniTopping, quantity);

        System.out.println("Your current price is $" + order.calcCost());



    }
    public static int verifyToppings(int num, String typeOfTopping){
        while ( num < 0){
            System.err.println("Invalid entry, please re-enter the number of " + typeOfTopping+ " toppings:");
            num = input.nextInt();
        }
        return num;
    }
}
/*
Create a class named `PizzaOrderApp` and write a program for pizza ordering applications with the following requirements:

    1. Display the following welcome message and ask the user if they want to order a pizza:

                    Welcome to Cydeo Pizza House

                Would you like to order a pizza?

            If they say "yes," proceed to the next step.

            If they say "no," display "Thanks for using our service!".

            For any other response, the application should ask the user to re-enter until the user provides a valid entry.

    2. Ask the user to select the size of the pizza. If the user enters an invalid entry,
    then the application should ask the user to re-enter until the user provides a valid entry.

    3. Ask the user to enter the number of cheese toppings and pepperoni toppings. If any entry is invalid,
    then the application should ask the user to re-enter until the user provides a valid entry.

    4. Enter the quantity.

    5. The application should create the pizza object for the pizza that the user ordered and display the total price at the end.

 */