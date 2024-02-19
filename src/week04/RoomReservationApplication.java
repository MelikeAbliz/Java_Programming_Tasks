package week04;

import java.util.Scanner;

public class RoomReservationApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\t\tWelcome to the Cydeo Skyline Inn!");

        System.out.println("Would you like to reserve a room? (Yes/No)");
        String answer = input.next().toLowerCase();

        if ( !( answer.equals("yes") || answer.equals("no") ) ){ // if the user entered answer is invalid
            System.err.println("Invalid answer, please try again later!");
            System.exit(1);
        }

        if(answer.equals("no")){
            System.out.println("You have a wonderful day!");
            System.exit(0);
        }

        System.out.println("Enter your first name:");
        String firstName = input.next();
        firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase(); // mUHTar ==> Muhtar


        System.out.println("Enter your last name:");
        String lastName = input.next();
        lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase(); // mUHTar ==> Muhtar

        System.out.println("Enter your age:");
        int age = input.nextInt();

        if( age <=0 ){ // if the user entered age is invalid
            System.err.println("Invalid age, please try again later!");
            System.exit(1);
        }

        double discount = 0;

        if(age >= 64){ // Senior discount
            discount += 0.1;
        }

        System.out.println("Here are our available rooms and their prices:\n" +
                "\t\t\t\t\t\t\t\t\t King Bed   ===== $160\n" +
                "\t\t\t\t\t\t\t\t\t Queen Bed  ===== $120\n" +
                "\t\t\t\t\t\t\t\t\t Single Bed ===== $100\n" +
                "\n" +
                "Which room would you like to reserve? (King/Queen/Single)");

        String roomType = input.next().toLowerCase();

        if( !(roomType.equals("king") || roomType.equals("queen") || roomType.equals("single")) ){ // if invalid room type is entered
            System.err.println("Invalid room type, please try again later!");
            System.exit(1);
        }

        double roomPrice = (roomType.equals("king")) ? 160 :(roomType.equals("queen"))? 120 : 100;

        System.out.println("How many nights would you like to stay?");
        int numberOfNights = input.nextInt();

        if( numberOfNights <= 0){ // if the user entered numberOfNights is invalid
            System.err.println("Invalid number, please try again later!");
            System.exit(1);
        }

        System.out.println("Are you a veteran? (Yes/No)");
        answer = input.next().toLowerCase();

        input.close();

        if ( !( answer.equals("yes") || answer.equals("no") ) ){ // if the user entered answer is invalid
            System.err.println("Invalid answer, please try again later!");
            System.exit(1);
        }

        if(answer.equals("yes")){ //if the user is veteran
            discount += 0.15;
        }

        double totalPrice = roomPrice * numberOfNights;
        double totalTax = totalPrice * 0.08;
        double totalDiscount = totalPrice * discount;
        double grandTotal = (totalPrice + totalTax)  - totalDiscount;

        System.out.println("Hello " + firstName +", , You have selected " + roomType +" Bed for " + numberOfNights + " nights to stay.");
        System.out.println("Room fee: $"+totalPrice);
        System.out.println("Tax is: $" + totalTax);

        if(discount > 0){ //if the person has discount
            System.out.println("Discount is: $" +totalDiscount);
        }

        System.out.println("Your grand total is: $"+ grandTotal);

    }
}
/*
2. Create a class named RoomReservationApplication and write a program with the following requirements:

        1. Display the following welcome message on the console:
        "Welcome to the Cydeo Skyline Inn!"

        2. Ask the user, "Would you like to reserve a room? (Yes/No)"

        3. If the user enters "No," then display the following message:
        "You have a wonderful day!"

        4. the user enters "Yes," then gather the following information:
        4.1 Ask the user's first name
        4.2 Ask the user's last name
        4.3 Ask the user's age
        4.4 Display the available room types and ask which type of room the user would like to reserve
        4.5 Ask how many nights the user wants to stay
        4.6 Ask if the user is a veteran

        5. Calculate the total price based on the selected room type and the number of nights the user is staying.
        Room types and their prices:
        Single Bed ==> $100
        Queen Bed  ==> $120
        King Bed   ==> $160

        6. Calculate the tax and grand total, assuming the sales tax is 8%.

        7. Calculate the total discount the user is eligible for:
        If the user is a senior (at least 64 years old), they are eligible for a senior discount (10%).
        If the user is a veteran, they are eligible for a veterans discount (15%).

        8. Display the user's first name, total cost, tax, total discounts, and grand total in the following format on the console:

        Example 1:
        Welcome to the Cydeo Skyline Inn!

        Agent: Would you like to reserve a room? (Yes/No)
        User: No

        Output:
        You have a wonderful day!

        Example 2:
        Welcome to the Cydeo Skyline Inn!

        Agent: Would you like to reserve a room? (Yes/No)
        User: Yes

        Agent: Please enter your first name:
        User: Jimmy

        Agent: Please enter your last name:
        User: Joe

        Agent: Please enter your age:
        User: 55

        Agent: Here are our available rooms and their prices:
        King Bed   ===== $160
        Queen Bed  ===== $120
        Single Bed ===== $100

        Which room would you like to reserve? (King/Queen/Single)
        User: King

        Agent: How many nights would you like to stay?
        User: 3

        Agent: Are you a veteran? (Yes/No)
        User: No

        Output:
        Hello Jimmy, You have selected King Bed for 3 nights to stay.
        Room fee: $480.00
        Tax is: $38.40

        Your grand total is: $518.40

        Optional Challenge: If the user enters any invalid inputs for Yes/No, age, number of nights, or room type,
        terminate the program with appropriate error messages.


        boolean condition for INVALID:  !(Valid Condition)
        */