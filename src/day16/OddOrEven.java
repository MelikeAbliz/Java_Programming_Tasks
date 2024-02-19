package day16;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while (true) {

            System.out.println("enter a number");

            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is an even number");
            } else {
                System.out.println(num + " is an odd number");
            }

            System.out.println("would you like to enter another number? YES/NO");

            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no")) ){
                System.err.println("invalid entry!! would you like to enter another number? YES/NO");
                 answer = input.next().toLowerCase();
            }
            if (answer.equals("no")) {
                break;
            }
        }
    }
}
