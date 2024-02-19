package day07;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel=1;
        String type="";

        if (gradeLevel>=1 && gradeLevel<20){
            if (gradeLevel>=1&&gradeLevel<=5){
                type="Elementary school";
            }else if (gradeLevel<=8){
                type="Middle school";
            }else if (gradeLevel<=12){
                type="High school";
            }else if (gradeLevel<=16){
                type="College";
            }else if (gradeLevel<=18){
                type="Grad School";
            }
        }else {
            type="Invalid grade level given";
        }
        System.out.println(type);
    }
}
/*
given a number(byte) grade level, determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */