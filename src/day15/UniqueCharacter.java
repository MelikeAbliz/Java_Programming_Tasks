package day15;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter string: ");
        String str=input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            int j=0;
            while (j<str.length()) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    count = 1;
                    break;
                }
                j++;
            }
            if (count==0){
                System.out.print(str.charAt(i));
            }
        }
        input.close();

   }
}
/*
Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are the same, then it's a unique

 */