package day22;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArray {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C"};
       String[] arr2 = {"D", "E", "F", "G"};
        System.out.println(combineTwoArray(arr1,arr2));
    }
    public static ArrayList<String> combineTwoArray(String[] arr1, String[] arr2){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(arr1));
        arrayList.addAll(Arrays.asList(arr2));
        return arrayList;
    }
}
/*
7. write a program that can combine two String arrays into one ArrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */