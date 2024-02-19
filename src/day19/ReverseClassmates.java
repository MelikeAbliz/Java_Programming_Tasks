package day19;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class ReverseClassmates {

    public static void main(String[] args) {
        String[] classmates = {"asiye yashar", "muhtar mehmut", "reyhan eli", "alix art", "mak salam", "dilxat rosul",
                "ali geni", "mihri gulam", "ayse quddus", "isak hadi"};
       String reverse="";

        for (int i = 0; i < classmates.length; i++) {
            String classmate=classmates[i];
//            for (int j = classmate.length()-1; j >=0 ; j--) {
//                 reverse=""+classmate.charAt(j);
//                System.out.print(reverse);
//            }
//            System.out.println();
            reverse= StringUtility.reverse(classmate);
            System.out.println(reverse);
        }


    }
}
/*
create a string array, and store the names of your classmates (10)
            reverse each student's names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */