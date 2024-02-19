package day25;

public class Carpet {
//    look at day18 Carpet class

    public double  width,length,unitPrice;
    public double totalPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, double totalPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(double width, double length, double unitPrice){
        totalPrice  =(width*length) * unitPrice;
        if (isPersian){
            totalPrice+=200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}
/*
1. Create a custom class named Carpet:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                Add a constructor that can set all the fields

                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info about the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is Persian  carpet, add 200$ to the totalPrice
 */