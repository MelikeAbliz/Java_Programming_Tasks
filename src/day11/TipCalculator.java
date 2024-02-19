package day11;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println("Split or No Split (Yes or No)?");
       String yesNo=new Scanner(System.in) .nextLine().toLowerCase();
        System.out.println("Enter the number of people");
        int peopleNum=new Scanner(System.in) .nextInt();
        System.out.println("Enter the check amount:");
        int amount=new Scanner(System.in) .nextInt();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service=new Scanner(System.in) .nextLine().toLowerCase();
        if (yesNo.equals("yes")) {
            double tipRate = (service.equals("excellent")) ? 0.25 : (service.equals("great")) ? 0.2
                    : (service.equals("good")) ? 0.15 : (service.equals("fair")) ? 0.1 : 0.05;
            double totalTip = amount * tipRate;
            double totalToPay = amount + totalTip;
            double totalPerPerson = totalToPay / peopleNum;
            double tipPerPerson = totalTip / peopleNum;
        System.out.println("Number55 of people entered: " +peopleNum+
                "\nTotal to pay:" +totalToPay+
                "\nTotal tip: " +totalTip+
                "\nTotal per person: " +totalPerPerson+
                "\nTip per person: "+tipPerPerson);
        }else System.out.println("welcome again, please in split field to enter yes");
    }
}
/*
Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also be the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             The number of people who entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No Split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number55 of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75


 */