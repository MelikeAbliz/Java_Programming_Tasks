package groupTasks;

import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("please input money: ");
        int money=new Scanner(System.in).nextInt();
        double remain=0;
        if (money<0) {
            System.err.println("Invalid input" + "\n all inputs must be greater than 0.");
        return;
        }
        System.out.println("please select iteam: water?juice?biscuit? ");
        double juice=5.35, water=2.95, biscuit=6.85;
        String choice=new Scanner(System.in).nextLine();
            if (money > juice && choice.equalsIgnoreCase("juice")) {
                remain = money - juice;
                System.out.println("juice price is: " + juice + " and your pays is: " + money);

            } else if (money > water && choice.equalsIgnoreCase("water")) {
                remain = money - water;
                System.out.println("water price is: " + water + " and your pays is: " + money);
            } else if (money > biscuit && choice.equalsIgnoreCase("biscuit")) {
                remain = money - juice;
                System.out.println("biscuit price is: " + biscuit + " and your pays is: " + money);
            } else {
                System.out.println("you do not have enough money to buy these item,please try egain");
            }
       int bill=(int)(remain),
               quarters=(int)((remain-bill)/0.25),
               dimes=(int)(((remain-bill)%0.25)/0.1),
               nickles=(int)((remain-bill)%0.25%0.1/0.05),
               pennies=(int)((remain-bill)%0.25%0.1%0.05/0.01);
        System.out.println("output: "+bill+" dollar bill, "+quarters+" quarters, "
                +dimes+" dimes, "+nickles+" nickles, "+pennies+" pennies");
    }
}
/*
If any input is not greater than 0, it should print “Invalid input”
The vending machine operates with the following denominations:
Dollar bills: $1 Quarters: $0.25 Dimes: $0.10 Nickels: $0.05 Pennies: $0.01
Example-1
Input: item price is $3.50 and the customer pays $5.00
Output: 1 dollar bill, 2 quarters, 0 dimes, 0 nickels, 0 pennies
Example-2
Input: item price is $1.17 and the customer pays $2.00
Output: 0 dollar bill, 3 quarters, 0 dimes, 1 nickels, 3 pennies
Example-3
Input: item price is $-3.50 and the customer pays $5.00
Output: Invalid input
Explanation: all inputs must be greater than 0.
 */