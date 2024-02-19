package day27.iphoneTask;

public class Iphone {
    public String model, color,size;
    public static String brand, OS, madeIn, designedIn;
    public double price;
    public static boolean isSmartPhone;


    public Iphone(String model, String color, String size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    static {
        brand = "Apple";
        OS = "iOS";
        madeIn = "USA";
        designedIn = "USA";
        isSmartPhone=true;
    }
    public static void printOperatingSystem(){
        System.out.println("Operating System "+OS);
    }
    public void call(long phoneNumber){
        System.out.println("please call the number: "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("please send message to the phone number: "+phoneNumber);
    }
    public void faceTime(long phoneNumber){
        System.out.println("please call the number: "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println("please send message: "+email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialize all the fields.

            Add a static block to initialize all the statics.

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()

 */