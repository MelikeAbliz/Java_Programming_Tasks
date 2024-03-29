package day28.item;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || name == null) {
            System.err.println("Invalid name" + name);
            System.exit(1);
        }
//         name can not contain any special characters other than space
        String specialCh = "";
        for (char each : name.toCharArray()) {
            if (!Character.isLetterOrDigit(each) && each != ' ') {
                specialCh += each;
            }
        }
        if (specialCh.length() > 0) {
            System.err.println("Invalid name" + name);
            System.exit(1);
        }
//        name must start with letters
        if (!Character.isLetter(name.charAt(0))) {
            System.err.println("Invalid name" + name);
            System.exit(1);
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
//        unit price can not be negative
        if (unitPrice < 0) {
            System.err.println("Invalid price" + unitPrice);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Invalid quantity" + quantity);
        }
        if (name.equalsIgnoreCase("toilet paper")) {
            this.quantity = 1;
        }

        this.quantity = quantity;
    }
    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity= " + quantity +
                ", total price= $=" + calcCost() +
                '}';
    }
}
/*
3. create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                unit price can not be negative
                quantity can not be negative
                if the Item name is toilet paper (case insensitive), then the quantity can not be more than 1


        Add a constructor that allows the user to set all the fields when the object is created.
                (If the arguments are not valid, they should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity, and total cost info as calculated by calcCost()
 */