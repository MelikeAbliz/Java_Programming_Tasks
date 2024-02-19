package day30.bookTask;

public class E_Book extends Book{
    private String size;
    private int page;


    public E_Book(String title, String type, String author, double price,String size,int page) {
        super(title, type, author, price);
        setSize(size);
        setPage(page);

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if (page<=0){
            System.err.println("Invalid page"+page);
            System.exit(1);
        }
        this.page = page;
    }
    public void readBook(){
        System.out.println("reading "+getTitle());
    }
}
/*
2 Create a subclass of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()
 */