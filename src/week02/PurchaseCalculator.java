package week02;

public class PurchaseCalculator {
    public static void main(String[] args) {
        double salesTaxRate = 8;
        String itemName = "Fuji Apple";
        double unitPrice = 1.5;
        int quantity = 5;

        double totalCostBeforeTax = unitPrice * quantity;
        double salesTax = totalCostBeforeTax * salesTaxRate /100;
        double grandTotal = totalCostBeforeTax + salesTax;

        System.out.println("Item name: " +itemName);
        System.out.println("Unit price: $" + unitPrice);
        System.out.println("Quantity: " + quantity+"\n");
        System.out.println("Total cost before tax: $" +totalCostBeforeTax);
        System.out.println("Sales tax: $" + salesTax);
        System.out.println("=================================");
        System.out.println("Grand total: $" + grandTotal );


    }
}
/*
	Create a class named PurchaseCalculator.

		 Given the following variables:
		   - salesTaxRate (double)
		   - itemName (String)
		   - unitPrice (double)
		   - quantity (int)

		 The program should calculate the total cost before tax, the sales tax, and the grand total.
		 Then, display them on the console in the following format:

		 Example:
		   itemName = "Fuji Apple"
		   unitPrice = 1.5
		   quantity = 5
		   salesTaxRate = 8

		 Output:
		   Item name: Fuji Apple
		   Unit price: $1.5
		   Quantity: 5

		   Total cost before tax: $7.5
		   Sales tax: $0.6
		   ==========================
		   Grand Total: $8.1
 */