package day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class SecondMaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(1, 1,4,9, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));
        Collections.sort(arrList);
        int frequencyMax=Collections.frequency(arrList,Collections.max(arrList));
        System.out.println("frequencyMax = " + frequencyMax);
        int frequencyMin=Collections.frequency(arrList,Collections.min(arrList));
        System.out.println("frequencyMin = " + frequencyMin);
        int max= arrList.get(arrList.size()-frequencyMax-1);
        int min= arrList.get(frequencyMin+1);
        System.out.println("second max = " + max);
        System.out.println("second min = " + min);
    }
}
/*
5. Write a program that can display the second maximum and minimum numbers from an ArrayList of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			The second maximum number is 7
			The second minimum number is 1

	Note: DO NOT use any loops

 */