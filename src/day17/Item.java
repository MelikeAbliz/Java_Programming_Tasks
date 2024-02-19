package day17;

public class Item {
    public String name;
    public double unitPrice;
    public long quantity;
    public double totalPrice;

    public void setInfo(String name, double unitPrice, long quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public double calcCost(){
        totalPrice=unitPrice*quantity;
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
/*
Create a class called Item
    Attributes:
        name, unitPrice, quantity

    Actions:
    	setInfo(): sets all the fields of Item object
        calcCost(): returns the total price of the Item
        toString(): when a SalaryCalculator object is passed in a print statement, it should display
        the full information of the item object


 */