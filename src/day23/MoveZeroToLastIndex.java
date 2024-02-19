package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeroToLastIndex {
    public static void main(String[] args) {
        Integer[] arr = {1,0,8,0,3,0,4,0};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
//        for (int i = 0,j=0; i < arrayList.size(); i++) {
//            if (arrayList.get(i)!=0) {
//               Collections.swap(arrayList,j++,i);
//            }
//        }
//        System.out.println(arrayList);

        for (int i = 0,j=0; i < arrayList.size(); i++) {
            if (arrayList.get(i)==0){
            arrayList.remove(i);
            arrayList.add(0);
            }
        }
        System.out.println(arrayList);


    }
}
/*
Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */