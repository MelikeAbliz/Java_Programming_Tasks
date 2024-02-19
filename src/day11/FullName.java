package day11;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        System.out.println("please enter first name:");
        String firstName=new Scanner(System.in).nextLine().toLowerCase();
        System.out.println("please enter last name:");
        String lastName=new Scanner(System.in).nextLine().toLowerCase();
        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1);
        lastName=(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1);
        System.out.println(firstName+" "+lastName);
        return;
    }
}
/*
Write a program that asks the user to enter first and last names,
 and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */