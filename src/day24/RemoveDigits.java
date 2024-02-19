package day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class RemoveDigits {
    public static void main(String[] args) {
        Character[] list={'$','A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'};
        ArrayList<Character> arrList = new ArrayList<>(Arrays.asList(list));
        arrList.removeIf(ch-> Character.isDigit(ch));
        System.out.println(arrList);
    }
}
/*
 Write a program that can remove all the digits from an ArrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', A', 'B', 'C', 'D', '@', '!']

	Note: DO NOT use any loops
 */