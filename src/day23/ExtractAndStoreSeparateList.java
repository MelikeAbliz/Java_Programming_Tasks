package day23;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractAndStoreSeparateList {
    public static void main(String[] args) {
        String str="ABCD123$%#@&456EFG!";
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specials = new ArrayList<>();
        for (char each:str.toCharArray()){
            if (Character.isLetter(each)){
                letters.add(each);
            }else if (Character.isDigit(each)){
                digits.add(each);
            }else specials.add(each);
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specials = " + specials);

    }
    
}
/*
Write a program that can extract the special characters, digits, and letters from a string and store them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */