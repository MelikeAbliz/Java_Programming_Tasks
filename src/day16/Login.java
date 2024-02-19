package day16;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String u,p;
        int attempt=3;
        do {
            System.out.println("please enter user name:");
            u=input.next();
            System.out.println("please enter password:");
            p=input.next();
            attempt--;

            if (attempt==0){
                break;
            }
        }while (!(u.equals("Cydeo")&& p.equals("WoodenSpoon")) );
    }
}
