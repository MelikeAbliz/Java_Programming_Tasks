package week12;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    final private List<Product> products;

    public ShoppingCart() {
        products = new LinkedList<>(); // doubly linked list: Insertion and deletion of the elements is faster
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addToCart(Product product) { // adds the given product to the cart, if the given product is null, then throws exception
        if (product == null) {
            throw new NullPointerException("Null key can not be added to the shopping cart");
        }
        products.add(product);
    }


    public void addToCart(Product[] products) { // adds the given array of products to the list
        for (Product eachProduct : products) {
            addToCart(eachProduct); // throws exception if any element in the given array of products is null
           /*
            if(eachProduct == null){ // ignores the null keys of the given array of products, and adds the rest to the shopping cart
                continue;
            }
            this.products.add(eachProduct);
            */
        }
    }


    public void remove(String name) { // removes the given product name from the shopping cart, if the product does not exist, then throws ProductNotFoundException
        /*
        boolean containsTheProduct = false;
        for (Product eachProduct : products) { // to make sure that the product is in the shopping cart
            if (eachProduct.getName().equalsIgnoreCase(name)) {
                containsTheProduct = true;
            }
        }

        if (!containsTheProduct) {
            throw new ProductNotFoundException("The product " + name +" not found in the cart");
        } else {
            products.removeIf(p -> p.getName().equalsIgnoreCase(name));
            System.out.println("The product " + name + " has been removed from the cart successfully");
        }
        */

        if(products.removeIf(p -> p.getName().equalsIgnoreCase(name))){ // to make sure that the product is in the shopping cart
            System.out.println("The product " + name + " has been removed from the cart successfully");
        }else{ // otherwise
            throw new ProductNotFoundException("The product " + name +" not found in the cart");
        }


    }


    public void displayCart() { // displays all the products that are in the shopping cart
        int count = 1;
        for (Product eachProduct : products) {
            System.out.println("Product " + count++ + ":");
            System.out.println("\t" + eachProduct.getName() + " - $" + eachProduct.getPrice());
            System.out.println("------------------------------");
        }

    }


}

/*
5. Create a ShoppingCart class to represent the user's shopping cart

	Include a list to store products in the cart.

	Implement methods to add a product to the cart, display the cart contents, and remove a product from the cart.

	Throw ProductNotFoundException in the removeItem method when attempting to remove a product that is not in the cart.

 */