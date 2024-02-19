package week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        System.out.println(numbers);

        int n = 30;

        if (n > numbers.size()) {
            System.out.println("Not enough elements in the arraylist");
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            numbers.removeIf(p -> Collections.max(numbers) == p);
        }

        /*
        numbers.removeIf( p -> Collections.max(numbers) == p);
        System.out.println(numbers);

        numbers.removeIf( p -> Collections.max(numbers) == p);
        System.out.println(numbers);

        numbers.removeIf( p -> Collections.max(numbers) == p);
        System.out.println(numbers);
*/

        System.out.println(Collections.max(numbers));



        /*
         To return the Nth maximum number, we remove first (N-1) maximum numbers.
          then the next max number will be the Nth max number of the collection

          {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10}

          {1, 2, 3, 4, 5, 6} ===> 6

          To return the Nth minimum number, we remove first (N-1) minimum numbers.
          then the next min number will be the Nth max number of the collection


          {1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10}

          {3, 4, 5, 6, 7, 8, 9, 10, 10, 10} ===> 3

         */


    }

}

/*
2. write a program that can return the nth largest number from an arraylist
            ex:
                arraylist = {1,2,3,4,5,6,7,7,8,8}
                n = 3

            output:
                6
 */