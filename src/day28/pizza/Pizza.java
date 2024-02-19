package day28.pizza;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    private static String shape = "Circle";

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size == null){
            System.err.println("Size can not be null");
            System.exit(1);
        }

        boolean validSize = size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")
                || size.equalsIgnoreCase("large");

        if(!validSize){
            System.err.println("Invalid Size: "+size);
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping < 0){
            System.out.println("Invalid number of cheese topping: "+numberOfCheeseTopping);
            System.exit(1);
        }

        if(size.equalsIgnoreCase("small") && numberOfCheeseTopping <= 3){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 4){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 5){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else{
            System.out.println("Invalid number of cheese topping: "+numberOfCheeseTopping);
            System.exit(1);
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping < 0){
            System.out.println("Invalid number of pepperoni topping: "+numberOfPepperoniTopping);
            System.exit(1);
        }

        if(size.equalsIgnoreCase("small") && numberOfPepperoniTopping <= 3){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfPepperoniTopping <= 4){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfPepperoniTopping <= 5){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else{
            System.out.println("Invalid number of pepperoni topping: "+numberOfPepperoniTopping);
            System.exit(1);
        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double statingPrice = (size.equalsIgnoreCase("small")) ? 10 :(size.equalsIgnoreCase("medium"))? 12 : 14;
        double totalPrice = statingPrice + 2 * (numberOfCheeseTopping+numberOfPepperoniTopping);
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }
}
/*
4. Create a class named Pizza:
                Private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields.
                        Conditions:
                            The size of the pizza can only be small, medium, or large. case insensitive

                            The number of cheese toppings can not be negative; the maximum number of cheese toppings is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            The number of pepperoni toppings can not be negative; the maximum number of pepperoni toppings is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows the user to set all the fields when the object is created.
                                (If the arguments are not valid, they should not be set to the instances)


                Methods:
                    calcCost(): returns the total cost of the pizza
                    toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */