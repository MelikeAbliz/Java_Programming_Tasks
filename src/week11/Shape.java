package week11;

import java.text.DecimalFormat;

public abstract class Shape {

    private final String name;

    public Shape(){
        name = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();


    public abstract void draw();

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return name + "{" +
                "area='" + df.format( calcArea() ) + '\'' +
                ", perimeter='" + df.format(calcPerimeter() )+ '\'' +
                '}';
    }

}

/*
1. Create a class named Shape:
    Variables:
        name (final)

    Encapsulate all the fields

    Methods:
        calcArea();
        calcPerimeter()
        toString(): includes the area & perimeter of the shape
 */