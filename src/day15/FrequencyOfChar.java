package day15;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        frequencyOfChar();
    }
    public static void frequencyOfChar() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a string: ");
        String str = input.nextLine();
        System.out.println("please enter a char: ");
        String ch = input.nextLine();
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            if(ch.equals(""+str.charAt(i))) { //this also right
//            if(ch.contains(""+str.charAt(i))) {
//                continue;
                frequency ++;
            }
        }
        System.out.println(frequency);
        input.close();
    }
}
/*
Create a class named FrequencyOfChar and
Write a program that asks the user to enter a string and a char,
 which returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */