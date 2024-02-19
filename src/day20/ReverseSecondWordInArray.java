package day20;

import java.util.Arrays;

public class ReverseSecondWordInArray {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String reverse="";
        String[] word=sentence.split(" ");
//        for (int i = word[1].length()-1; i >= 0; i--) {
//            reverse+=""+word[1].charAt(i);
//        }
//        word[1]=reverse;
        word[1]=utilities.StringUtility.reverse(word[1]);
        System.out.println(Arrays.toString(word));
    }
}
/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */