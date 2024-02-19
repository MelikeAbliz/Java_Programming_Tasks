package day15;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("would you like to reserve a room?YES/NO");
        String answer=input.next().toLowerCase();
        while (!(answer.equals("yes")||answer.equals("no")) ){
            System.err.println("invalid answer!!! please re enter!");
            System.err.println("would you like to reserve a room?YES/NO");
            answer=input.next().toLowerCase();
        }
            if (answer.equals("yes")){
                System.out.println("\tKing Bed ==> 120$\n" +
                        "\t            Queen Bed ==> 100$\n" +
                        "\t            single Bed ==> 80$");
                System.out.println("which type of room would you like?");
                String type = input.next().toLowerCase();
                while (!(type.equals("king")|| type.equals("queen")|| type.equals("single")) ){
                    System.err.println("invalid room!!!please re-type room");
                    type = input.next().toLowerCase();
                }
                int totalPrice=0;
                    if (type.equals("king")){
                        System.out.println("how many nights are you stay?");
                        int roomNum=input.nextInt();
                        totalPrice=roomNum*120;
                        System.out.println("the total price of the room is :"+totalPrice+"$");
                        System.out.println("Would you like to reserve another room?Yes/No");
                    }else if (type.equals("queen")){
                        System.out.println("how many rooms are you type?");
                        int roomNum=input.nextInt();
                         totalPrice=roomNum*100;
                        System.out.println("the total price of the room is :"+totalPrice+"$");
                        System.out.println("Would you like to reserve another room?Yes/No");
                    }else if (type.equals("single")){
                        System.out.println("how many rooms are you type?");
                        int roomNum=input.nextInt();
                         totalPrice=roomNum*80;
                        System.out.println("the total price of the room is :"+totalPrice+"$");
                        System.out.println("Would you like to reserve another room?Yes/No");
                       }
                }
            else {
                System.out.println("Have a nice day");
            }
            input.close();

    }
}
/*
Create a class called RoomReservation, and write a program for the room reservation;
 your program asks the user if they want to reserve a room.
    	if the user enters yes, then ask which type of room the user wants to reserve.
    	if the user entered no, print "Have a nice day"
    			(if the user entered any invalid answer (other than yes/no) ask the user
    			 to reenter until the user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and the total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until the user provides a valid entry)

 */