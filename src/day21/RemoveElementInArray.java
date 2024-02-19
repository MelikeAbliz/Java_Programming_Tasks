package day21;

import java.util.Arrays;

public class RemoveElementInArray {
    public static void main(String[] args) {
        String[] arr = {"ab", "cf", "rr", "ld"};
        System.out.println(Arrays.toString(removeElement(arr, "ld")));
        int[] num = {5, 6, 7, 99, 22, 44, 15, 88};
        System.out.println(Arrays.toString(removeElement(num, num[4])));
    }

    public static String[] removeElement(String[] arr, String element) {
        String[] newArr = new String[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            String each = arr[i];
            if (each == element) {
                continue;
            }
            newArr[j++] = each;
        }
        return newArr;
    }

    public static int[] removeElement(int[] arr, int element) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            int each = arr[i];
            if (each == element) {
                continue;
            }
            newArr[j++] = each;
        }
        return newArr;
    }
}
