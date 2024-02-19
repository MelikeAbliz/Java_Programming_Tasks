package day29.car;

public class TestCars {
    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.setInfo("toyota","white",2010,18000);
        System.out.println(toyota.getMake());
        System.out.println(toyota);

    }
}
