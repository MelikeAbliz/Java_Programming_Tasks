package day25;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {
        Offer offer1=new Offer("USA Hybrid","IT Company","Java Developer",
                100000,true,true,true,true);
        Offer offer2=new Offer("Canada Local","Finance Company","Backend Developer",
                120000,true,false,true,true);
        Offer offer3=new Offer("Turkey Remote","Amare Global","Data Analyst",
                90000,true,false,true,false);
        Offer offer4=new Offer("Germany Local","Google Company","Cyber Security",
                95000,false,true,true,true);
        Offer offer5=new Offer("Dubai Local","Pizza Factor","Desktop Manager",
                130000,false,false,false,true);
        Offer offer6=new Offer("Saudi Remote","StarBucks","Front_End Developer",
                110000,true,true,true,false);
        Offer offer7=new Offer("Belgium Hybrid","Amazon","QA Engineer",
                98000,false,true,false,true);
//        2.2 Create an array of Offers named myOffers and store all 7 objects of offers
        Offer[] myOffers=new Offer[]{offer1,offer2,offer3,offer4,offer5,offer6,offer7};
//        2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
        ArrayList<Offer> fullTimeOffers=new ArrayList<>();
        fullTimeOffers.addAll(Arrays.asList(myOffers));
//        2.3.1 Write a program that can remove the offer objects that are not full-time
        fullTimeOffers.removeIf(p->!p.isFullTime);
//        2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
        ArrayList<Offer> localOffers=new ArrayList<>();
        localOffers.addAll(Arrays.asList(myOffers));
//        2.4.1 Write a program that can remove all the offers that are not from local
        localOffers.removeIf(p->!p.location.contains("Local"));
//        2.5 Create an ArrayList of Offers named offersWithBenefits and add all the offer objects.
//                    2.5.1 Write a program that can remove all the offers that do not have the benefit and do not have PTO
        ArrayList<Offer> offersWithBenefits=new ArrayList<>();
        offersWithBenefits.addAll(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p->!p.hasPTO);
//        2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
//                    2.6.1 Write a program that can remove all the offers that do not contain developer in the jobTitle
        ArrayList<Offer> devOffers=new ArrayList<>();
        devOffers.addAll(Arrays.asList(myOffers));
        devOffers.removeIf(p->!p.jobTitle.contains("Developer"));
//         2.7 Create an ArrayList of Offer named offers with 100K and add all the offer objects.
//                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

        ArrayList<Offer> offersWith100k=new ArrayList<>();
        offersWith100k.addAll(Arrays.asList(myOffers));
        offersWith100k.removeIf(p->p.salary<100000);

        System.out.println("fullTimeOffers = " + fullTimeOffers);
        System.out.println("localOffers = " + localOffers);
        System.out.println("offersWithBenefits = " + offersWithBenefits);
        System.out.println("devOffers = " + devOffers);
        System.out.println("offersWith100k = " + offersWith100k);

    }
}
/*
 2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offers named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that do not have the benefit and do not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that do not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers with 100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary



 */