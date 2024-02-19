package groupTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class HighestAndLowestNumOfString {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 2 -3 4 5"));
        System.out.println(highAndLow("1 9 3 4 -5"));
    }
    public static String highAndLow(String str) {
        String[] arr = str.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        int max = Integer.parseInt(list.get(0));
        int min = Integer.parseInt(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i)) > max) {
                max = Integer.parseInt(list.get(i));
            } else if (Integer.parseInt(list.get(i)) < min) {
                min = Integer.parseInt(list.get(i));
            }
        }
        return max + " " + min;
    }

}
/*
Write a method that takes a string of space separated numbers,
and returns the highest and lowest
number.
Examples:
highAndLow("1 2 3 4 5") // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes:
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space,
 and highest number is first.
 */