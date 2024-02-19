package day23;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
    public static void main(String[] args) {
        String[] arr = {"John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        arrayList.removeAll(Arrays.asList("Ahmed"));
        System.out.println(arrayList);
    }
}
/*
        Write a program that can remove all the names "Ahmed" from an ArrayList of String
        ex:
        list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

        output:
        ["John", "Daniel", "James", "Muhammed"];

 */
