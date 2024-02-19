package day16;

import java.util.Scanner;

public class RoomReservationDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("would you like to reserve a room?YES/NO");
        String answer = input.next().toLowerCase();
        int totalPrice=0;
        int sum=0;
      if (answer.equals("yes")){
           do {
               while (!(answer.equals("yes") || answer.equals("no"))) {
                   System.err.println("invalid answer!!! please re enter!");
                   System.err.println("would you like to reserve a room?YES/NO");
                   answer = input.next().toLowerCase();
               }
               System.out.println("there is our rooms");
               System.out.println("\tKing Bed ==> 120$\n" +
                       "\t            Queen Bed ==> 100$\n" +
                       "\t            single Bed ==> 80$");
               String kingBed = "king";
               String queenBed = "queen";
               String singleBed = "single";
               String type = "";
               int count = 0;
               System.out.println("which type of room would you like?/king/queen/single?");
               type = input.next().toLowerCase();
               while (!(type.equals("king") || type.equals("queen") || type.equals("single"))) {
                   System.err.println("invalid room!!!please re-type room/king/queen/single?");
                   type = input.next().toLowerCase();
               }
               input.nextLine();
               System.out.println("how many nights would you like to stay?");
               int nights = input.nextInt();
               while (nights <= 0) {
                   System.err.println("invalid number of nights, please try again");
                   nights = input.nextInt();
               }
               totalPrice = (type.equals("king")) ? nights * 120 : (type.equals("queen")) ? nights * 100
                       : nights * 80;
               System.out.println("your total price of room is :"+totalPrice);
               System.out.println("would you like to reserve another room?");
               String answer2=input.next().toUpperCase();
               sum+=totalPrice;
               while (!(answer2.equals("NO")||answer2.equals("YES"))){
                   System.err.println("Invalid entry!!!please re-enter!!!");
                   System.out.println("would you like to reserve another room?");
                   answer2=input.next().toUpperCase();
               }
               if (answer2.equals("YES")){
                   answer=answer2.toLowerCase();
               }
               if (answer2.equals("NO")) {
                   System.out.println("your total price of room is :"+sum);
                   System.exit(0);
               }
           } while (answer.equals("yes"));
       }
        if (answer.equals("no")){
            System.out.println("have a nice day ");
            System.exit(0);
        }
    }
}
/*
Create a class called RoomReservation, and write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom he/she wants to reserve and how many nights he/she is staying.
            Then Ask the user "Would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

                If the user enters any invalid entry,  ask the user to re-enter until the user provides a valid entry

 */