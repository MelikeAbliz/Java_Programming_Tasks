package day22;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceTask {
    public static void main(String[] args) {
        int[] intArr={1,2,3,4,5};
        System.out.println(Arrays.toString(replace(intArr,2,30)));
        String[] strArr={"white","black","yellow","green"};
        System.out.println(Arrays.toString(replace(strArr,1,"blue")));
        char[] chArr={'A','B','C','F','R'};
        System.out.println(Arrays.toString(replace(chArr,3,'D')));
        double[] doubles={1.1,2.5,3.8,4.9,5.6};
        System.out.println(Arrays.toString(replace(doubles,0,5.5)));
    }
    public static int[] replace(int[] arr,int index,int element){
        int[] newArr=new int[arr.length];
        for (int i = 0,j=0; i <arr.length ; i++) {
            arr[index]=element;
            newArr[j++]=arr[i];
        }return newArr;
    }

    public static double[] replace(double[] arr,int index,double element){
        double[] newArr=new double[arr.length];
        for (int i = 0,j=0; i <arr.length ; i++) {
            arr[index]=element;
            newArr[j++]=arr[i];
        }return newArr;
    }

    public static String[] replace(String[] arr,int index,String element){
        String[] newArr=new String[arr.length];
        for (int i = 0,j=0; i <arr.length ; i++) {
            arr[index]=element;
            newArr[j++]=arr[i];
        }return newArr;
    }

    public static char[] replace(char[] arr,int index,char element){
        char[] newArr=new char[arr.length];
        for (int i = 0,j=0; i <arr.length ; i++) {
            arr[index]=element;
            newArr[j++]=arr[i];
        }return newArr;
    }
}
/*
Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array,
        integer index, and integer newElement. The method replaces the element of
        the array at the given index with the new element and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays
 */