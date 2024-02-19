package day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapTask {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50, 90, 70, 80, 60};
        System.out.println(Arrays.toString(swap(arr, 5, 8)));
        Character[] chArr={'A','B','C','E','F'};
        System.out.println(Arrays.toString(swap(chArr,0,4)));
    }

    public static int[] swap(Integer[] arr, int index1, int index2) {
        int[] newArr = new int[arr.length];
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        Collections.swap(arrayList, index1, index2);
        for (int i = 0, j = 0; i < arrayList.size(); i++) {
            newArr[j++] = arrayList.get(i);
        }
        return newArr;
    }
    public static double[] swap(Double[] arr, int index1, int index2) {
        double[] newArr = new double[arr.length];
        ArrayList<Double> arrayList = new ArrayList<>(Arrays.asList(arr));
        Collections.swap(arrayList, index1, index2);
        for (int i = 0, j = 0; i < arrayList.size(); i++) {
            newArr[j++] = arrayList.get(i);
        }
        return newArr;
    }
    public static String[] swap(String[] arr, int index1, int index2) {
        String[] newArr = new String[arr.length];
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        Collections.swap(arrayList, index1, index2);
        for (int i = 0, j = 0; i < arrayList.size(); i++) {
            newArr[j++] = arrayList.get(i);
        }
        return newArr;
    }
    public static Character[] swap(Character[] arr, int index1, int index2) {
        Character[] newArr = new Character[arr.length];
        ArrayList<Character> arrayList = new ArrayList<>(Arrays.asList(arr));
        Collections.swap(arrayList, index1, index2);
        for (int i = 0, j = 0; i < arrayList.size(); i++) {
            newArr[j++] = arrayList.get(i);
        }
        return newArr;
    }
}
/*
Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array,
    integer i, and integer j. The method swaps the element at index i with the element
     at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array, and string array
 */