package day26.circle;

public class Circle {
    public double radius,diameter;
    public static double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter=radius*2;
    }
    public double calcArea(){
        return radius*radius*pi;

    }
    public double calcPerimeter(){
        return diameter*pi;
    }
    public void printPi(){
        System.out.println("pi value is: "+pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of the circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays the PI value
					toString(): displays the radius, diameter, pi, area, and perimeter of the circle
					when the object of a circle is passed in the print statement


 */