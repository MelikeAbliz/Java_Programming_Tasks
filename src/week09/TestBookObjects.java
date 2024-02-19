package week09;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBookObjects {

    public static void main(String[] args) {


        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");

        Book book2 = new Book("The Great Gatsby");

        Book book3 = new Book("1984","George Orwell",1949);

        Book book4 = new Book("The Catcher in the Rye", " J.D. Salinger", 1951, "Fiction" );

        Book book5 = new Book("Crime and Punishment","Fyodor Dostoevsky",1866,"Pychological Novel");


        ArrayList<Book> books = new ArrayList<>();
        books.addAll(Arrays.asList(
                new Book("Rich Dad Poor Dad", "Robert Kiyosaki"),
                new Book("The Great Gatsby"),
                new Book("1984","George Orwell",1949),
                new Book("The Catcher in the Rye", " J.D. Salinger", 1951, "Fiction" ),
                new Book("Crime and Punishment","Fyodor Dostoevsky",1866,"Pychological Novel", 15)
        ));

        books.get(2).setPrice(-80);
//         Book.price = 20;

        System.out.println(books);

        for (Book each : books) {
            System.out.println(each);
        }

        System.out.println("------------------------------------");

        System.out.println(Book.hasPages);
        System.out.println(Book.isReadable);
        System.out.println(Book.isEdible);


    }

}