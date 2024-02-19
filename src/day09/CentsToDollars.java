package day09;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter cents: ");
        int cents=input.nextInt();
        int dollars=cents/100;
        int remainder=cents-dollars*100;
        System.out.println(cents+" cents equal to "+dollars+ " dollars and "+remainder+" cents" );
    }
}
/*
if there is any remainder include them in the result of cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to 2 dollars and 25 cents

 */