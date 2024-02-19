package day22;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
       Integer[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
        System.out.println(Arrays.toString(replaceAll(arr,30,300)));
        String[] strArr={"white","black","white","yellow","blue","white","white"};
        System.out.println(Arrays.toString(replaceAll(strArr,"white","green")));
        Double[] doubles={10.5, 10.5, 20.6, 30.8, 40.3, 30.8, 30.8, 30.8};
        System.out.println(Arrays.toString(replaceAll(doubles,30.8,38.9)));
        Character[] chArr={'A','B','R','R','C','F','R','R','R'};
        System.out.println(Arrays.toString(replaceAll(chArr,'R','D')));
    }

    public static int[] replaceAll(Integer[] arr,int oldElement,int newElement){
        int[] newArr=new int[arr.length];
        for (int i = 0,j=0; i < arr.length; i++) {
            if (oldElement==arr[i]){
                arr[i]=newElement;
            }
            newArr[j++]=arr[i];
        }return newArr;
    }
    public static double[] replaceAll(Double[] arr,double oldElement,double newElement){
        double[] newArr=new double[arr.length];
        for (int i = 0,j=0; i < arr.length; i++) {
            if (oldElement==arr[i]){
                arr[i]=newElement;
            }
            newArr[j++]=arr[i];
        }return newArr;
    }
    public static String[] replaceAll(String[] arr,String oldElement,String newElement){
        String[] newArr=new String[arr.length];
        for (int i = 0,j=0; i < arr.length; i++) {
            if (oldElement==arr[i]){
                arr[i]=newElement;
            }
            newArr[j++]=arr[i];
        }return newArr;
    }

    public static char[] replaceAll(Character[] arr,char oldElement,char newElement){
        char[] newArr=new char[arr.length];
        for (int i = 0,j=0; i < arr.length; i++) {
            if (oldElement==arr[i]){
                arr[i]=newElement;
            }
            newArr[j++]=arr[i];
        }return newArr;
    }
}
/*
ReplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array,
        integer oldElement, and integer newElement. The method replaces all the elements of
  the array that match the given old element with the given new element and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays

 */