package day16;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean condition=false;
        for (; condition; ) {
            System.out.println(" cydeo -------for loop");
        }
        while (condition){
            System.out.println("hello cydeo------for while loop");
        }
        do {
            System.out.println("hello cydeo----for do while loop");
        }while (condition);
    }
}
