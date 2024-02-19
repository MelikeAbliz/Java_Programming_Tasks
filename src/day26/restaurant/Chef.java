package day26.restaurant;

import java.time.LocalDate;

public class Chef {
    public String name;
    public int employeeID ;
    public double hourlyRate ;
    public boolean isFullTime;
    LocalDate hire_date;

    public Chef(String name, int employeeID, double hourlyRate, boolean isFullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
        this.hire_date = hire_date;
    }
    public void makeOrder(){
        System.out.println(name+" is making order");
    }
    public void washDishes(){
        System.out.println(name+" is washing dishes");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + (isFullTime?"full_time":"part_time")+
                ", hire_date=" + hire_date +
                '}';
    }
}
/*
4.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

			   Add A constructor that can set all the fields.

		            Actions: (all void methods)
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time."

 */