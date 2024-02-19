package week11;

import java.time.LocalDate;

public final class FinalKeyword {

    public  static void main(String[] args) {

        final LocalDate dateOfBirth = LocalDate.of(1975, 5, 19);

        System.out.println("dateOfBirth = " + dateOfBirth);

       // dateOfBirth = LocalDate.of(1989, 6, 7);

        System.out.println("dateOfBirth = " + dateOfBirth);





    }

    public final void method(){
        System.out.println("Method");
    }


}