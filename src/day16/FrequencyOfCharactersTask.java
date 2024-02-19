package day16;

import java.util.Scanner;

public class FrequencyOfCharactersTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a string");
        String str = input.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == each) {
                    count++;
                }
            }
            if (result.contains("" + each)) {
                continue;
            }
            result += each + "" + count;
        }
        System.out.println(result);
        input.close();
    }
}
/*
Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character,
            then repeat it for all the remaining characters
 */