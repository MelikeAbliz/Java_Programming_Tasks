package day15;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter user name: ");
        String userName=input.nextLine();
        System.out.println("please enter password: ");
        String password=input.nextLine();
        int attemp=3;
        if (userName.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("Logged in.");
        }else {
            for (int i = 0; i < 3; i++) {
                if (i !=2){
                    System.err.println("incorrect user name and password!!! please re-enter");
                }else {
                    System.err.println("this is your last chance, please re-enter user name and password");
                }
                System.err.println("incorrect user name and password! please re-enter user name and password");
                System.err.println("please re-enter user name: ");
                userName=input.nextLine();
                System.err.println("please re-enter password: ");
                password=input.nextLine();
                if (userName.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("you are logged in now.");
                break;
                }
            }if( !(userName.equals("Cydeo") && password.equals("Cydeo123")) ){
                System.out.println("Your account is locked.");
            }
            input.close();
        }

    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to
                have three attempts to enter the correct credentials,
                 and if all three attempts fail, then print "Your account is locked."
 */