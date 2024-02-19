package groupTasks;

import java.util.Arrays;
import java.util.Collections;

public class CountNumOfDupChAndDig {
    public static void main(String[] args) {
        countNumOfDupChAndDig("abcde");
        countNumOfDupChAndDig("aabbcde");
        countNumOfDupChAndDig("aabBcde");
        countNumOfDupChAndDig("indivisibility");
        countNumOfDupChAndDig("aA11");
        countNumOfDupChAndDig("ABBA");
        System.out.println("----------------------");

        System.out.println(getNumber("abcde")==0);
        System.out.println(getNumber("aabbcde"));
        System.out.println(getNumber("aabBcde"));
        System.out.println(getNumber("indivisibility"));
    }

    public static void countNumOfDupChAndDig(String str) {
        String result = "";
        for (String each:str.toLowerCase().split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.toLowerCase().split("")), each);
            if (!result.contains(each) && frequency>1) {
                result += each;
            }
        }
        int dupCh=result.length();
        System.out.println(dupCh);
    }

    public static int getNumber(String input) {
        String[] characters = input.toLowerCase().split("");
        String newString = "";
        for (String each : characters) {
            int counter = 0;
            for (String s : characters) {
                if (s.equals(each)) {
                    counter++;
                }
            }
            if (counter > 1 && !(newString.contains(each))) {
                newString += each;
            }
        }
        return newString.length();
    }
}
/*
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric
digits that occur more than once in the input string. The input string can be assumed to contain only
alphabets (both uppercase and lowercase) and numeric digits.
Examples:
"abcde" -> 0 # no characters repeat more than once.
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice ('b' and 'B')
"indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */