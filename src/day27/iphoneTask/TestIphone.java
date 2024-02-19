package day27.iphoneTask;

public class TestIphone {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone("iphone 12", "Black", "5.6 inches",1000);

        System.out.println(iPhone);

        iPhone.faceTime(123456789);
        iPhone.faceTime("gmail@yahoo.com");
        iPhone.call(123456789);
        iPhone.text(123456789);

    }
}
