package day09;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your score: ");
        int score= input.nextInt();
        String result="your grade is ";
        if (score>=90&&score<=100){
            result+="A";
        }else if (score>80&&score<90){
            result+="B";
        }else if (score>70&&score<=80){
            result+="C";
        }else if (score>=60&&score<=70){
            result+="D";
        }else if (score>=0&&score<60){
            result+="F";
        }else {
            result+="Invalid Score";
        }
        System.out.println(result);
    }
}
/*
2.1 Ask the user to enter his/her score
2.2 Print the grade of the student (A, B, C, D, F)
2.3 If the user enters an invalid score (negative or more than 100) print "Invalid Score"
 */