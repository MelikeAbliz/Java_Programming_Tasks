package day08;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Solution 1: Must use ternary");
        int select = 1;
        String language = (select <= 5 && select >= 1) ?
                (select == 1) ? "Hello, thank you for your call"
                        : (select == 2) ? "Hola, gracias para llamar"
                        : (select == 3) ? "Merhaba, aradiginiz icin tesekkurler"
                        : (select == 4) ? "Privet, spasibo za vash zvonok"
                        : "Merci ,pour votre appel"
                : "Invalid Number55";
        System.out.println(language);

        System.out.println("Solution 2: MUST use the switch statement");

        switch(select){

            case 1:
                System.out.println("Hello, thank you for your call");
                break;

            case 2:
                System.out.println("Hola, gracias para llamar");
                break;

            case 3:
                System.out.println("Merhaba, aradiginiz icin tesekkurler");
                break;

            case 4:
                System.out.println("Privet, spasibo za vash zvonok");
                break;

            case 5:
                System.out.println("Merci ,pour votre appel");
                break;


        }
    }
}
/*
Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number
 		that's given in the selection and print the following message:
			for 1: Hello, thank you for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number55"

		Solution 1: Must use ternary
		Solution 2: MUST use the switch statement

 */