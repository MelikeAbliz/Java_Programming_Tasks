package day28.square;

public class Square {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0) {
            System.err.println("The side of the square should not be negative" + side);
            System.exit(1);
        }
        this.side = side;
    }

    public double calcArea() {
        return side * side;
    }

    public double calcPerimeter() {
        return side * 4;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
2. Create a class named Square:
        Private variables:
            side

        Encapsulate all the fields.

            Condition:
                The side of the square should not be negative

        Add a constructor that allows the user to set all the fields when the object is created.


        Methods:
            calcArea(): returns the area of square
            calcPerimeter(): returns the perimeter of the square
            toString(): can display the side, area, and perimeter of the square when the object is passed in the print statement
 */