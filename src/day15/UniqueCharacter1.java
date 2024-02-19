package day15;

import java.util.Scanner;

public class UniqueCharacter1 {
    public static void main(String[] args) {//use for loop
        Scanner input=new Scanner(System.in);
        System.out.println("please enter string: ");
        String str=input.nextLine();
        String unique = "";
        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);
            if(str.indexOf(each) == str.lastIndexOf(each)  ){
                unique += each;
            }
        }
        System.out.println(unique);
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