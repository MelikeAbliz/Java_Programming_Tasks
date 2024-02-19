package day22;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertTask {
    public static void main(String[] args) {
        int[]  arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(insert(arr,2,100)));

        Character[] chArr={'A','B','C','E','F'};
        System.out.println(Arrays.toString(insert(chArr,3,'D')));
    }
//        public static Integer[] insert(Integer[] array, Integer index, Integer element) {
//            Integer[] arr = Arrays.copyOf(array, array.length + 1);
//            for (int i = arr.length - 1; i > index; i--) {
//                arr[i] = arr[i - 1];
//            }
//            arr[index] = element;
//            return arr;
//        }
    public static int[] insert(int[] arr, int index, int element) {
        int [] newArr =new int[arr.length+1];
        for (int i = 0, k=0; i < newArr.length; i++) {
            if(i==index){
                newArr[i]= element;
            }else{
                newArr[i] = arr[k++];
            }
        }
        return  newArr;
    }
//    public static int[] insert(Integer[] arr,int index,int element){
//        int[] newArr=new int[arr.length+1];
//        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(arr));
//        arrayList.add(index,element);
//        for (int i = 0,j=0; i < arrayList.size(); i++) {
//            newArr[j++]=arrayList.get(i);
//        }return newArr;
//    }

    public static double[] insert(Double[] arr,int index,double element){
        double[] newArr=new double[arr.length+1];
        ArrayList<Double> arrayList=new ArrayList<>(Arrays.asList(arr));
        arrayList.add(index,element);
        for (int i = 0,j=0; i < arrayList.size(); i++) {
            newArr[j++]=arrayList.get(i);
        }return newArr;
    }

    public static String[] insert(String[] arr,int index,String element){
        String[] newArr=new String[arr.length+1];
        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList(arr));
        arrayList.add(index,element);
        for (int i = 0,j=0; i < arrayList.size(); i++) {
            newArr[j++]=arrayList.get(i);
        }return newArr;
    }
    public static char[] insert(Character[] arr,int index,char element){
        char[] newArr=new char[arr.length+1];
        ArrayList<Character> arrayList=new ArrayList<>(Arrays.asList(arr));
        arrayList.add(index,element);
        for (int i = 0,j=0; i < arrayList.size(); i++) {
            newArr[j++]=arrayList.get(i);
        }return newArr;
    }
}
/*
3. Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, and integer element. the method inserts the given element into the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array, and string array


 */