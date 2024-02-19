package day30.bookTask;

public class AudioBook extends Book {
    private int length;
    private String narrator;

    public AudioBook(String title, String type, String author, double price,int length,String narrator) {
        super(title, type, author, price);
        setLength(length);
        setNarrator(narrator);
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            System.err.println("Invalid length" + length);
            System.exit(1);
        }
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
/*
3 Create a sub-class of Book named AudioBook:
			Extra variables:
				length, narrator

			Encapsulate all the extra fields
					Conditions:
						1. length can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				toString()


 */