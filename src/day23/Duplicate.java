package day23;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50, 90, 70};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        arrayList.addAll(arrayList);
        System.out.println(arrayList);
    }
}
/*
Write a program that can duplicate the elements of an ArrayList
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];

 */