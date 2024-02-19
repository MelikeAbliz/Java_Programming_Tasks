package day27.dogTask;

public class Dog {
    public String name,breed,color,size;
    public char gender;
    public int age;
    public static boolean isFriendly;
    public static int numberOfLegs, numberOfEyes, numberOfWings;

    public Dog(String name, String breed, String color, String size, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }
    static {
        numberOfLegs = 2;
        numberOfEyes = 2;
        numberOfWings = 0;
        isFriendly = true;
    }
    public void eat(){
        System.out.println(name+" is eating");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void play(){
        System.out.println(name+" is playing");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
3.  Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialize all the fields.

            Add a static block to initialize all the statics.

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */