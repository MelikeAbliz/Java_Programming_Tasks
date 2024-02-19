package quiz;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        emailFromCYDEO();
    }
    public static void emailFromCYDEO(){

        Scanner input=new Scanner(System.in);
        System.out.println("please enter yes or no? if CYDEO accounting team send you email about payment");
        String yesOrNo=input.next().toLowerCase();
        while (!yesOrNo.equals("yes")){//only enter yes or no
            System.err.println("please contact accounting@gmail.com");
            yesOrNo=input.next().toLowerCase();
        }
        System.out.println("congratulation! you can pay your tuition now.");
    }
}
