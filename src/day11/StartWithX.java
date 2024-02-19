package day11;

import java.util.Scanner;

public class StartWithX {
    public static void main(String[] args) {
        System.out.println("please enter a word:");
        String word=new Scanner(System.in).nextLine().toLowerCase();

        if(word.startsWith("x")){
            word=word.replace("x","a");
        }
        System.out.println("after replace: "+word);

    }
}
/*
Create a class named StartsWithX and write a program that asks the user to enter a word.
 If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex


 */