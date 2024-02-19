package replit;

import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;
        for (; inhabitants > 0; inhabitants /= 2) {

            System.out.println("Day " + day + " [" + inhabitants + "]");
            day++;
        }
        System.out.println("---- EXTINCT ----");
    }
}
/*
Ex:
  Input:
    6
  Output:
    Day 0 [6]
    Day 1 [3]
    Day 2 [1]
    ---- EXTINCT ----

Ex:
  Input:
    20
  Output:
    Day 0 [20]
    Day 1 [10]
    Day 2 [5]
    Day 3 [2]
    Day 4 [1]
    ---- EXTINCT ----
 */