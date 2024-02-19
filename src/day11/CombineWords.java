package day11;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        System.out.println("please enter a word1:");
        String word1=new Scanner(System.in).nextLine();
        System.out.println("please enter a word2:");
        String word2=new Scanner(System.in).nextLine();
        if (word1.charAt(word1.length()-1)==word2.charAt(0)){
            word2=word2.replace(""+word2.charAt(0),"");
        }
        System.out.println("after combine two words: "+word1+word2);

    }
}
/*
Create a class named CombineWords. Ask the user to enter two words.
Then add them together and print.
But if the last letter of the first word and the first letter of the last letter
 are the same,print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */