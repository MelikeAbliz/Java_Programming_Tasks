package day20;

public class UniqueElementsInArray {
    public static void main(String[] args) {
        int[] num={2,4,3,45,77,44,3,3,2,2};
//        for (int i = 0; i < num.length; i++) {
//            int frequency=0;
//            for (int j = 0; j < num.length; j++) {
//                if (num[i] == num[j] ) {
//                    frequency++;
//                }
//            }
//             if(frequency==1)
//                 System.out.print(num[i]+" ");
//        }

        for (int each : num) {
            int frequency=0;
            for (int each2:num) {
                if (each==each2){
                    frequency++;
                }
            }if (frequency==1)
                System.out.print(each+" ");
        }
    }
}
/*
 Write a program that can display the unique elements of an array

			MUST use for each loop


 */