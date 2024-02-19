package groupTasks;

import java.util.Scanner;

public class AnimalFeast {
    public static void main(String[] args) {
        System.out.println("please enter animal name: ");
        String animalName = new Scanner(System.in).nextLine();
        System.out.println("please enter the animal brought dish name:");
        String dishName = new Scanner(System.in).nextLine();
        if (animalName.length() >= 2 && dishName.length() >= 2) {
            boolean isAllowed = animalName.startsWith("" + dishName.charAt(0))
                    && animalName.endsWith("" + dishName.charAt(dishName.length() - 1));
            if (isAllowed) {
                System.out.println("it is allowed");

            } else {
                System.out.println("it is not allowed");
            }
        } else System.out.println("Beast and dish should not be less than two characters.");
    }
}
/*
All the animals are having a feast! Each animal brings one dish.
There is just one rule: the dish
must start and end with the same letters as the animal's
name. For example, the great blue heron is bringing garlic
naan and the chickadee is bringing chocolate cake.
Write a program that takes the animal's name and dish
prints “it is allowed” or “it is not allowed” to indicate
whether the beast is allowed to bring the dish to the feast.
Each beast and dish must have at least two letters, if not,
print “Beast & dish should not be less than two characters.”.
 */