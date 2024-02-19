package day11;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        System.out.println("please enter a word: ");
        String word=new Scanner(System.in).nextLine().toLowerCase();
        if (word.contains("x")){
           word=word.replace("x","a");
        }
        System.out.println("after replace: "+word);
        boolean exists=true;

        if(word.length()>=5 && word.length()<=10){
            if(word.substring(0, 4).contains("java") || word.substring(1,5).contains("java")){
                System.out.println("true");
            }
            else
                System.out.println("false");
        }

    }

}
/*
Create a class named ReplaceX, and write a program that asks the user to enter a word.
 and replace all the x or X with the character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */