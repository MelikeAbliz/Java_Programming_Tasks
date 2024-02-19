package day11;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        System.out.println("please enter a word1:");
        String word1=new Scanner(System.in).nextLine();
        System.out.println("please enter a word2:");
        String word2=new Scanner(System.in).nextLine();
        word1=word1.replace(""+word1.charAt(0),"");
        word2=word2.substring(1);
        System.out.println("after without first char: "+word1+word2);
        return;
    }
}
/*
Create a class named WithoutFirstChar. Ask the user to enter two words.
 Print the first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */