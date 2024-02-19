package day11;
import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        System.out.println("please enter your email contain _ :");
        String email=new Scanner(System.in).nextLine();
        String firstName=email.substring(0,email.indexOf("_"));
        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1);
        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        lastName=(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1);
       String  domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("First name: "+firstName );
        System.out.println("Last name: "+lastName );
        System.out.println("Domain: "+domain );


    }
}
/*
Create a class called EmailTask2.
   Assume that the email address is constructed by the person's first name
   and followed by an underscore and last name.

   Write a program that will print out information about the user based on email.
    Print first name, last name, and domain.

   First and Last names should be printed in the proper format - uppercase first letter
    and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple

 */