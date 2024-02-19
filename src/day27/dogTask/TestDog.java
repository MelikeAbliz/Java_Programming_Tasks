package day27.dogTask;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Lucy", "Husky", "White", "small",'F', 5 );

        System.out.println(dog);
        dog.eat();
        dog.play();
        dog.sleep();


    }
}
