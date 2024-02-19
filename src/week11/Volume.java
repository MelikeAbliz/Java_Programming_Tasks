package week11;

public interface Volume {

    boolean HAS_VOLUME = true;

    double calcVolume();

    static void main(String[] args) {
        System.out.println("Static Method");
    }

    default void method(){
        System.out.println("Default method");
    }

}