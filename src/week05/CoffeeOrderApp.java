package week05;

import java.util.Scanner;

public class CoffeeOrderApp {
    public static void main(String[] args) {
        double blackCoffeePrice = 2.5,
                lattePrice = 2.8,
                cappuccinoPrice = 3.5,

                totalPrice = 0;

        Scanner input = new Scanner(System.in);

        // Step 1:
        System.out.println("\t\tWelcome to the Coffee Order App!\n\nWould you like to order coffee? Yes/No");
        String answer = input.next().toLowerCase();

        if( !(answer.equals("yes") || answer.equals("no")) ){ // if the given answer is invalid (not yes and not no)
            System.err.println("Invalid answer, please try again later!");
            System.exit(1); // terminates the entire application
        }

        if(answer.equals("no")){
            System.out.println("Thanks for using our service!");
            return; // exits the main method
        }

        for (int i = 0; i < 1;) { // Possibly be an infinite loop

            // Step 2:
            System.out.println("Coffee Options:");
            System.out.println("\t1. Black Coffee - " + blackCoffeePrice);
            System.out.println("\t2. Latte - " + lattePrice);
            System.out.println("\t3. Cappuccino - " + cappuccinoPrice);

            // Step 3:
            System.out.println("Enter your choice:");
            int choice = input.nextInt();

            switch (choice) { // ordering the coffee & setting the total price
                case 1: // if user selected Black Coffee
                    System.out.println("Added Black Coffee to Your Order.");
                    totalPrice += blackCoffeePrice;
                    break;

                case 2: // if user selected Latte
                    System.out.println("Added Latte to Your Order.");
                    totalPrice += lattePrice;
                    break;

                case 3: // if user selected Cappuccino
                    System.out.println("Added Cappuccino to Your Order.");
                    totalPrice += cappuccinoPrice;
                    break;

                default: // If the user enters invalid choice
                    System.err.println("Invalid choice, please try again later!");
                    System.exit(1);

            }

            // Step 4:
            System.out.println("Would you like to add another order? Yes/No");
            answer = input.next().toLowerCase();

            if (!(answer.equals("yes") || answer.equals("no"))) { // if the given answer is invalid (not yes and not no)
                System.err.println("Invalid answer, please try again later!");
                System.exit(1); // terminates the entire application
            }

            if (answer.equals("no")) { // if the user does not want to add another order
                System.out.println("Your total price is $" + totalPrice);
                //System.exit(0);
                i = 1; // to set the loop condition to false ===> loop will be terminated
            }

        }

        input.close();

    }
}
/*
Create a class named CoffeeOrderApp with the following variables:

        - blackCoffeePrice: the price of black coffee
        - lattePrice: the price of a latte
        - cappuccinoPrice: the price of a cappuccino
        - totalPrice: the total cost of the user's order

    Create a straightforward coffee ordering application with these steps:

        Step 1. Ask the user if they want to order coffee.

            	Welcome to the Coffee Order App!

            Would you like to order coffee?


            If they say "yes", proceed to step #2. If they say "no," display "Thanks for using our service!"

            For any other response, end the application with the error message "Invalid answer, please try again later!"

        Step 2. Display the coffee options on the console:

            Coffee Options:
                1. Black Coffee - $blackCoffeePrice
                2. Latte - $lattePrice
                3. Cappuccino - $cappuccinoPrice

        Step 3. Ask the user to pick a coffee:

            3.1 If they choose 1, display "Added Black Coffee to Your Order."

            3.2 If they choose 2, display "Added Latte to Your Order."

            3.3 If they choose 3, display "Added Cappuccino to Your Order."

            3.4 If their choice is invalid, end the application with the error message "Invalid choice, please try again later!"

        Step 4. Ask if they want another order:

            If they say "yes," repeat from step #2.

            If they say "no," display the total cost of their order: "Your total is: $total."

            For any other response, end the application with the error message "Invalid answer, please try again later!"
 */