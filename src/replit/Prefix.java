package replit;

import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        //WRITE YOUR CODE BELOW


        if(str.substring(n).contains(str.substring(0,n))){
            System.out.println("true");
        }else
            System.out.println("false");
    }
}
/*
Ex:
  Input:
    abXYabc
    1
  Output:
    true
  -> 'a' is the prefix because n is 1, and the character 'a' is found again in the String "bXYabc"

Ex:
  Input:
    abXYabc
    2
  Output:
    true
  -> 'ab' is the prefix because n is 2, and the characters 'ab' are found again in the String "XYabc"

Ex:
  Input:
    abXYabc
    3
  Output:
    false
  -> 'abX' is the prefix because n is 3, and the characters 'a' are NOT found again in the String "Yabc"
 */