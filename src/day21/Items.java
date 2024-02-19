package day21;

public class Items {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        //(add \t between two words)
        System.out.println("1. print the following output: (add \\t between two words):");
        for (String[] item : items) {
            for (String product : item) {
                System.out.print(product+"\t");
            }
            System.out.println("\t");
        }

        //add \t between two words :reverse single order
        System.out.println("2. print the following output: (add \\t between two words):");
        for (int i = 0; i < items.length; i++) {
            String[] item = items[i];
            String result="";
            for (int j = item.length - 1; j >= 0; j--) {
                String product=item[j];
                for (int k = 0; k < product.length(); k++) {
                    result=""+product.charAt(k);
                    System.out.print(result);
                }
                System.out.print("\t");
            }
            System.out.println();
        }

        //add \t between two words :reverse single order
        System.out.println("3. print the following output: (add \\t between two words):");
        for (int i = items.length-1; i >=0; i--) {
            String[] item = items[i];
            String result="";
            for (int j = 0; j <item.length; j++) {
                String product=item[j];
                for (int k = 0; k < product.length(); k++) {
                    result=""+product.charAt(k);
                    System.out.print(result);
                }
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i=items.length-1;i>=0;i--) {
            String[] item = items[i];
            String result="";
            for (int j = item.length - 1; j >= 0; j--) {
                String product=item[j];
                for (int k = 0; k < product.length(); k++) {
                    result=""+product.charAt(k);
                    System.out.print(result);
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
/*
Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Paper   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Paper   Tissues    Diapers
				Apple    Banana   Grape    Avocado

 */