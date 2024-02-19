package day26.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant("Melike","USA",5);
        Server server1=new Server("malik",12,45,true,
                LocalDate.of(2019,10,22));
        Server server2=new Server("mahir",15,43,false,
                LocalDate.of(2021,1,29));
        Server server3=new Server("hanife",18,39,false,
                LocalDate.of(2020,8,18));
        restaurant.servers.addAll(Arrays.asList(server1,server2,server3));

        Chef chef1=new Chef("medine",19,40,true,
                LocalDate.of(2019,3,15));
        Chef chef2=new Chef("meryem",21,35,false,
                LocalDate.of(2020,7,25));
        Chef chef3=new Chef("leyla",23,48,true,
                LocalDate.of(2021,5,19));
        restaurant.chefs.addAll(Arrays.asList(chef1,chef2,chef3));
        Server[] servers = {
                new Server("Yasin", 29, 15, false,LocalDate.of(2021,5,19)),
                new Server("Sabryne", 28, 10, false,LocalDate.of(2019,3,15)),
                new Server("Karim", 27, 12, false,LocalDate.of(2020,7,25)),
                new Server("Aysel", 26, 20, true,LocalDate.of(2021,5,19)),
                new Server("Kamal", 25, 23, true,LocalDate.of(2020,8,18)),
        };

        Chef[] chefs = {
                new Chef("Halim", 23, 35, true,LocalDate.of(2020,8,18)),
                new Chef("Habib", 22, 26, false,LocalDate.of(2021,7,25)),
                new Chef("Bojan", 21, 27, true,LocalDate.of(2019,11,29)),
        };
        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);
        System.out.println(restaurant);
    }
}
/*
4.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers
	        	 to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs
	            to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurant's information
 */