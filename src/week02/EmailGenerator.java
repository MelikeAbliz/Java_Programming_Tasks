package week02;

public class EmailGenerator {
    public static void main(String[] args) {
        String firstName = "DANIEL";
        int birthYear = 1985;

        String pattern = firstName + "_" + birthYear; // every pattern account MUST have firstname, underscore and birth year

        String gmail = pattern + "@gmail.com";
        String yahoo = pattern + "@yahoo.com";
        String outlook = pattern + "@outlook.com";
        String hotmail = pattern + "@hotmail";
        System.out.println( "Your generated emails are:\n\tYahoo: " + yahoo + "\n\tGmail: " + gmail
                + "\n\tOutlook: " + outlook + "\n\tHotmail: " + hotmail );



    }
}
/*
1. Create a class named EmailGenerator.

		Given the following variables:
		   - firstName
		   - birthYear

		 The program should generate emails for Gmail, Yahoo, and Outlook by combining the firstName with
		 an underscore and birthYear, followed by the domain of the email.

		 Example:
		   firstName = "Daniel"
		   birthYear = 1985

		 Output:
		   Your generated emails are:
		      Yahoo: Daniel_1985@yahoo.com
		      Gmail: Daniel_1985@gmail.com
		      Outlook: Daniel_1985@outlook.com
		      hotmail: Daniel_1985@hotmail.com
 */