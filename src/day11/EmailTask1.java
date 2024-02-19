package day11;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        System.out.println("please enter first name:");
        String firstName=new Scanner(System.in).nextLine();
        System.out.println("please enter last name:");
        String lastName=new Scanner(System.in).nextLine();
        String emailAddress=firstName+"_"+lastName+"@gmail.com";
        System.out.println(emailAddress);
        lastName=emailAddress.substring(0,emailAddress.indexOf("_"));
        firstName=emailAddress.substring(emailAddress.indexOf("_")+1,emailAddress.indexOf("@"));
        emailAddress=firstName+"_"+lastName+emailAddress.substring(emailAddress.indexOf("@"));
        System.out.println(emailAddress);
    }
}
/*
Create a class called EmailTask1.
   Assume that the email address is constructed by the person's first name and
    followed by an underscore and last name.

    Write a program that can swap the first name with the last name in the email
    (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */