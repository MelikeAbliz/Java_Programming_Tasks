package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NthLargestNum {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,7,8,8};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(nthLargestNum(arrayList,5));

    } public static int nthLargestNum(ArrayList<Integer> arrayList,int nth) {
        if (nth>arrayList.size()){
            System.err.println("Not enough elements in the arraylist");
            System.exit(1);
        }
        for (int i = 0; i < nth - 1; i++) {
            arrayList.removeIf(p -> Collections.max(arrayList) == p);
        }
        return Collections.max(arrayList);

    }
}
/*
write a program that can return the nth largest number from an ArrayList
            ex:
	            ArrayList = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */