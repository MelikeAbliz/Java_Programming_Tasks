package week06;

public class Pizza {
    public String size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping, quantity;

    public static String shape = "Circle";

    public void setInfo(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping, int quantity) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        this.quantity = quantity;
    }

    public double calcCost(){

        double basePrice = (size.equals("small"))? 10  :(size.equals("medium"))? 12 : 14 ;
        double topping = (1.5 * numberOfPepperoniTopping) + (0.8 * numberOfCheeseTopping);
        double total = ( basePrice + topping ) * quantity;
        return total;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", quantity=" + quantity +
                ", price=" + calcCost() +
                '}';
    }

}
/*
Create a custom Java class named Pizza with the following specifications:

    Attributes:
        size: Indicates the size of the pizza (small, medium, large, or extra-large).
        quantity: Indicates the quantity of pizza
        numberOfCheeseTopping: Indicates the number of cheese toppings.
        numberOfPepperoniTopping: Indicates the number of pepperoni toppings.

    Actions:
        setInfo: Sets all the fields of the pizza object.
        calcCost(): Returns the total cost of the pizza.
        toString(): Returns a string containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost().

        The pizza cost is determined by:
            Small: Starts at $10.
            Medium: Starts at $12.
            Large: Starts at $14.

            Per pepperoni topping: $1.5
            Per cheese topping: $0.8

 */