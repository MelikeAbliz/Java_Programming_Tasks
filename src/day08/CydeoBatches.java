package day08;

public class CydeoBatches {
    public static void main(String[] args) {
        String batchType="US morning";
        String result="";
        System.out.println("Solution 1: use if statement");
        if (batchType=="US morning"){
            result="Class times are 10-5 EST. M, T, Th, F.";
        } else if (batchType=="US evening") {
            result="Class times are 7-10 EST. M, T, W, Th, S, S";

        } else if (batchType=="EU") {
            result="Class times are  10-5 EST. M, T, W, Th, F.";

        } else {
            result="Invalid Btach";
        }
        System.out.println(result);

        System.out.println("Solution 2: use the switch statement");

    }
}
/*
Create a class named CydeoBatches. In Cydeo, we have three batch types: US morning, US evening, and EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If the batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use the switch statement
				Solution 2: use if & switch statements mixed
 */