package day16;

import java.util.Scanner;

public class UniqueCharacterWithoutIndex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter string: ");
        String str=input.nextLine();
        String unique="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int frequency=0;
            for (int j = 0; j <str.length(); j++) {
                if (str.charAt(j)==ch) {
                    frequency++;
                }
            }
                if (frequency==1){
                    unique+=ch;
                }
            }
                System.out.print(unique);
        input.close();

   }
}
/*
Write a program that can find the unique characters from a string without using index()
and lastIndexOf() methods

                        Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it
            for the remaining characters to find the frequency.
                        if frequency of a character == 1  =========> unique
 */