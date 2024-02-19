package day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElementInArrayList {
    public static void main(String[] args) {
       Integer[] list = {1, 1, 2, 3, 3, 4, 5, 5};
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(list));
        int i=0;
        int frequency=0;
        for (Integer integer : arrList) {
            if (Collections.frequency(arrList,integer)==1) {
                System.out.print(integer+" ");
            }
        }
        System.out.println();
        arrList.removeIf(a->(Collections.frequency(arrList,a))>1);
        System.out.println("unique element = " + arrList);



        String str = "aaabbbbccccc";

        String result = "";    //a3b4c5

        for (String each : str.split("")) {

            frequency = Collections.frequency(  Arrays.asList( str.split("") )   , each );

            if(!result.contains(each)){
                result += each + frequency;
            }

        }


        System.out.println(result);


    }
}
/*
1. Write a program that can display the unique elements of an ArrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops
 */