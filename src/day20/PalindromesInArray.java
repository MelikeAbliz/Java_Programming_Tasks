package day20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PalindromesInArray {
    public static void main(String[] args) {
        String[] array = {"anna", "level", "Java"};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String eachWord = array[i];
            String reverse = "";
            for (int j = eachWord.length() - 1; j >= 0; j--) {
                reverse += "" + eachWord.charAt(j);
            }
            if (eachWord.equals(reverse)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */