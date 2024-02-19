package quiz;

import java.util.Arrays;

public class Quiz1 {
    public static void main(String[] args) {

        int[] arr1=new int[3];
        int[] arr2={1,2,3,4,5};
        arr1=arr2;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i]);
        }


    }
}
