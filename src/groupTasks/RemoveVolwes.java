package groupTasks;

import java.util.Scanner;

public class RemoveVolwes {
    public static void main(String[] args) {
        removeVolwes();
    }

    public static String removeVolwes(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!("aeiou ".indexOf(currentChar) == -1)) { // checks if the character is not a vowel or space
                continue;
            }
            result += currentChar;
        }
        return result;
    }
    public static void removeVolwes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a string:");
        String s = sc.nextLine().toLowerCase();
        if (s.length() >= 1 && s.length() <= 1000) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                        || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                        || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                        || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                        || s.charAt(i) == 'O'
                        || s.charAt(i) == 'U') {
                    continue;
                } else {
                    s = s.replaceAll(" ", "");
                    System.out.print(s.charAt(i));
                }
            }
        }
    }
}
/*
Question-1 Remove Vowels and Spaces from a String
Given a string str, write a method that removes the vowels 'a', 'e', 'i', 'o', 'u' and spaces from it,
and returns the new string.
Example 1:
Input: "write once run anywhere"
Output: "wrtncrnnywhr"
Example 2:
Input: "everything is an object"
Output: "vrythngsnbjct"
Example 3:
Input: "ae iou"
Output: ""
Note:
str consists of lowercase English letters or space only.
1 <= str.length <= 1000
 */