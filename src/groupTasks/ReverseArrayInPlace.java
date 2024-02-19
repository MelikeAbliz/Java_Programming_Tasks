package groupTasks;

import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(arr)));
        int[] arr1 = {150};
        System.out.println(Arrays.toString(reverse(arr1)));
        int[] arr2 = {};
        System.out.println(Arrays.toString(reverse(arr2)));
    }

    public static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = arr[i];
        }
        return reverse;
    }
}
/*
Example 1
Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
Example 2
Input: [150]
Output: [150]
Constraints
The given array is not empty.
1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
 */
