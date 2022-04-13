package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter your full name : ");
        String fullName=input.nextLine();    //Java ProgrammingEnter

        System.out.println("Enter your building number : ");
        String buildingNumber=input.next();   //7925A

        input.nextLine();   // Enter

        System.out.println("Enter your Street name : ");
        String streetName=input.nextLine();    // Jones Branch DriveEnter

        System.out.println("Enter your city name : ");
        String cityName=input.nextLine();   // McLeanEnter

        System.out.println("Enter your state name : ");
        String stateName=input.next();    //VAEnter

        System.out.println("Enter your zip code : ");
        String zipCode=input.next();   //22012Enter

        input.nextLine();

        System.out.println("Enter your country name : ");
        String country=input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);
    }
}
