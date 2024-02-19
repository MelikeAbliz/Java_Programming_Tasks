package day11;

import java.util.Scanner;

public class ReallyNewerMind {
    public static void main(String[] args) {
        System.out.println("please enter a word:");
        String word=new Scanner(System.in).nextLine().toLowerCase();

        if(word.endsWith("ly")){
            System.out.println("really???");;
        }else {
        System.out.println("never mind");
        }
    }
}
/*
Create a class named ReallyNeverMind. Ask the user to enter a word.
 If the word ends with "ly", print "really???",
   otherwise, print "never mind"
 */