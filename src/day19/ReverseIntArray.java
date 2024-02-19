package day19;

import java.util.Arrays;

public class ReverseIntArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int[] reverse=new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--) {
            reverse[j++]=array[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
/*
Write a program that can reverse an array of integers and return it as a new array
        Ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */