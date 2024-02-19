package day23;

import java.util.ArrayList;
import java.util.Arrays;

public class SetLastElementToZero {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50, 90, 70};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        arrayList.set(arrayList.size()-1,0);
        System.out.println(arrayList);
    }
}
/*
1. write a program that can set the last element of the Integer ArrayList to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];

 */