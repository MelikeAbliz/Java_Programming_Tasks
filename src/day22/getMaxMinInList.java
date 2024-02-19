package day22;

import java.util.ArrayList;
import java.util.Arrays;

public class getMaxMinInList {
    public static void main(String[] args) {
        Integer[] list = {1,2,3,4,5};
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(list));
        getMaxMin(arrayList);
    }

    public static void getMaxMin(ArrayList<Integer> arrayList){
        int max= arrayList.get(0);
        int min=arrayList.get(0);
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i)>max){
                max= arrayList.get(i);
            } if (arrayList.get(i)<min) {
                min = arrayList.get(i);
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
/*
8. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1


 */