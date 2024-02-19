package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {
        String[] colors={"red","green","orange","blue","pink","mor"};
        for (int i = 3; i < colors.length ; i++) {
            String color=colors[i];
            if (colors[i].length()>=4){
                System.out.println(color);
            }
        }

        System.out.println("------------------------");
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        if (arr1==arr2){
            System.out.println("same");
        }else System.out.println("not same");
        System.out.println("----------------");

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        boolean result=false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==5 && nums[i+1]==5){
               result=true;
               break;
            }
        }
        System.out.println(result);
    }
}
