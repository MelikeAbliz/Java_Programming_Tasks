package day07;

public class Grade {
    public static void main(String[] args) {
       char grade='A';
        String result = "";

        if (grade=='A'||grade == 'B'||grade == 'C'||grade == 'D'){
            if (grade == 'A') {
                result = "Excellent";
            } else if (grade == 'B') {
                result = "Great Job";
            } else if (grade == 'C') {
                result = "Good";
            } else if (grade == 'D') {
                result = "Passed";
            } else{
                result = "Failed";
            }
        }
        System.out.println(result);
    }
}
/*
a char variable named Grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            Otherwise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */