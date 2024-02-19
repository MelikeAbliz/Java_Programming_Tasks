package day12;

public class EligibleToVote {
    public static void main(String[] args) {
        eligibleToVote(-1,false);
    }
    public static void eligibleToVote(int age, boolean isAmerican){
        if(age < 0 || age > 150){
            System.err.println("Invalid age: "+age);
            return;
        }
        if (age>=21&&isAmerican){
            System.out.println("You are eligible to vote");
        }else System.out.println("You are not eligible to vote");
    }
}
/*
Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
 */