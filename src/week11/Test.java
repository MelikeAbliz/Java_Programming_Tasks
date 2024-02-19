package week11;

public class Test {

    public static void main(String[] args) {

        System.out.println("----------------------------------");

        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getName());
        System.out.println(circle.calcArea());

        System.out.println("----------------------------------");

        // Polymorphism:
        Shape shape;


        shape = new Circle(10.5);

        System.out.println(shape);
        System.out.println(((Circle) shape).getRadius());


        System.out.println("------------------------------------");




    }

}