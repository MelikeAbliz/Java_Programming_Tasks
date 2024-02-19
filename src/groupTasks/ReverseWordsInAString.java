package groupTasks;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords(" hello world "));
        System.out.println(reverseWords("a good   example"));
        System.out.println("------------------------------------------");
        System.out.println(reverseWords2("the sky is blue"));
        System.out.println(reverseWords2(" hello world "));
        System.out.println(reverseWords2("a good   example"));
        System.out.println(reverseWords(" "));
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        String reverse = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reverse += words[i] + " ";
        }
        reverse = reverse.trim();
        reverse = reverse.replaceAll("( )+", " ");
        return reverse;

    }

    public static String reverseWords2(String sentence) {
        String[] words = sentence.split(" ");
        Collections.reverse(Arrays.asList(words));
        String rev = String.join(" ", words);
        rev = rev.replaceAll("( )+", " ");
        return rev;
    }
}
/*
Question-2 Reverse Words in a String
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters.
The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
 The returned string should only have a single space separating the words. Do not include any extra spaces.
Example 1:
Input: s = "the sky is blue" Output: "blue is sky the"
Example 2:
Input: s = " hello world "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:
Input: s = "a good example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */