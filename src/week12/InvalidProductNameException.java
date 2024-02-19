package week12;

public class InvalidProductNameException extends RuntimeException{

    public InvalidProductNameException(){
        super("Product name can not be set to null/empty");
    }

    public InvalidProductNameException(String message){
        super(message);
    }

}