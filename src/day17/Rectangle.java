package day17;

public class Rectangle {
    public double length;
    public double width;
    public double area;
    public double perimeter;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        area=width*length;
        return area;
    }
    public double calculatePerimeter(){
        perimeter=area*2;
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
/*
create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, and returns
		    it as a double
		    toString(): when a rectangle object is passed in the print statement
		    		it should display the length, width, area, and perimeter of the Rectangle object

 */