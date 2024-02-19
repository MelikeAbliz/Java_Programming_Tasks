package day22;

import java.util.Collections;

public class RetrieveTask {
    public static void main(String[] args) {
        retrieve("Wooden Spoon!");
    }
    public static void retrieve(String str){
        String isLetter="";
        String isDigit="";
        String isSpecial="";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                isLetter+=str.charAt(i);
            }else if (Character.isDigit(str.charAt(i))){
                isDigit+=str.charAt(i);
            }else isSpecial+=str.charAt(i);
        }

        System.out.println("isLetter = " + isLetter);
        System.out.println("isDigit = " + isDigit);
        System.out.println("isSpecial = " + isSpecial);
    }
}
/*
5. Write a program that can retrieve the letters, digits, and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods

 */