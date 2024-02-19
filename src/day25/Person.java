package day25;

import java.time.LocalDate;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;

    public Person(String name, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        age=LocalDate.now().getYear()-dateOfBirth.getYear();
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void sleeping(){
        System.out.println(name+" is sleeping");
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
}
/*
name, age, gender, dateOfBirth, isMarried, isEmployed

Add a constructor that can set all the fields once an object is created

toString(), eat(String food), sleeping(), drink(String drink)
 */