package replit;

import java.util.Scanner;

public class CountHiAndCatDog {
    public static void main(String[] args) {
        String hi = "hi";
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        while (str.contains(hi)) {
            count++;
            str = str.replaceFirst(hi, "");
        }
        System.out.println(count);


        System.out.println("-----------------------");
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, (i + 3)).equals("cat"))
                catCount += 1;
            if (str.substring(i, (i + 3)).equals("dog"))
                dogCount += 1;
        }

        if (catCount == dogCount) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
/*
Ex:
  Input:
    catdog
  Output:
    true
    Input:
    catcat
  Output:
    false
    Input:
    cat-cheetah-dog-cat
  Output:
    false
 */