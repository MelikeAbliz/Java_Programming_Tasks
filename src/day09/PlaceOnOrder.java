package day09;

import java.util.Scanner;

public class PlaceOnOrder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the product name (multiple words): ");
        String productName= input.nextLine();
        System.out.println("please enter the price of the product: ");
        double price= input.nextDouble();
        System.out.println("please enter the quantity of the product: ");
        int quantity= input.nextInt();
        System.out.println("please enter your first name: ");
        String firstName= input.next();
        System.out.println(firstName+", your order for "+quantity+" "+ productName
                + " has been places. Your total payment is "+quantity*price+".");

    }
}
/*
Create a class named PlaceAnOrder:
                Ask the User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

 */