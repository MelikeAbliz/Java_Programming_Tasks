package week12;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            throw new InvalidProductNameException();
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if(price <= 0){
            throw new InvalidProductPriceException();
        }

        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

} // POJO/BEAN

/*
4. Create a class named Product with the following specifications:

	Attributes:
		name
		price

	Encapsulate all the fields:
		Throw InvalidProductNameException in the setter of name when a null key or empty string is given to the product name

		Throw InvalidProductPriceException in the setter of price when 0 or negative number is given to the product price

	Add a constructor that can set name and price

	Add toString() method
 */