package day22;

import java.util.ArrayList;
import java.util.Arrays;

public class Multiple2 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2!=0){
                arrayList.set(i,arrayList.get(i)*2);
            }
        }
        System.out.println(arrayList);

    }
}
/*
write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]


 */