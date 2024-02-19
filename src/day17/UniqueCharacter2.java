package day17;

import java.util.Scanner;

public class UniqueCharacter2 {
    public static void main(String[] args) {//use nested loop
        Scanner input=new Scanner(System.in);
        System.out.println("please enter string: ");
        String str=input.nextLine();
        String unique = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // a
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { // checks how many times the ch has appeared in str
                if(str.charAt(i) == ch ){ //if the ch has appeared in the string
                    frequency++; // increase the frequency by 1
                }
            }

            if(frequency == 1){ // if the frequency is one, then it's unique
                unique += ch;
            }

        }

        System.out.println(unique);
        input.close();


   }
}
/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */