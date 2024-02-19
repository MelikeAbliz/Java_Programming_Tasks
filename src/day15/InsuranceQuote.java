package day15;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your name:");
        String name = input.nextLine();
        System.out.println("please enter your gender:");
        String gender = input.next().toLowerCase();
        boolean isValidGender = (gender.equals("female") || gender.equals("male"));
        while (!(gender.equals("female") || gender.equals("male"))) {
            System.err.println("invalid entry, please re-enter");
            System.err.println("please enter your gender:");
            gender = input.next().toLowerCase();
        }if (gender.equals("female") || gender.equals("male")) {
            input.nextLine();
            System.out.println("are you married? anwser:YES/NO");
            String anwser = input.next().toLowerCase();
            while (!(anwser.equals("yes") || anwser.equals("no"))) {
                input.nextLine();
                System.err.println("Invalid entry,please re-enter");
                System.err.println("are you married? anwser:YES/NO");
                anwser = input.next().toLowerCase();
            }
            System.out.println("please enter your age");
            int age = input.nextInt();
            while (!(age > 0 && age < 120)) {
                System.err.println("Invalid age!!! please re-enter");
                age = input.nextInt();
            }
            System.out.println("how many miles did you drive a day?");
            double miles = input.nextDouble();
            while (miles < 5) {
                System.err.println("Invalid miles,please re-enter");
                miles = input.nextDouble();
            }
            //6. Ask the user if he/she wants full coverage or liability insurance.
            System.out.println("would you want full coverage?");


        }

        input.close();
    }
}
/*
Create a class called InsuranceQuote, and write a program that can calculate
 the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if the user enters an invalid entry, ask the user to re-enter
	    			until the user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if the user enters an invalid entry,
						ask the user to re-enter until the user provides a valid entry)
				4. Ask the user to enter your age
						(age can not be negative or greater than 120)
						(if the user enters an invalid entry, ask the user
						to re-enter until the user provides a valid entry)
				5. Ask the user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance.

				7. Ask if he/she had any accidents or claims in the past 5 years (Yes/No)
						(if the user enters an invalid entry, ask the user to re-enter until
						 the user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if the user enters an invalid entry, ask the user to re-enter
						until the user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has an anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in the past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in the past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount

 */