package liveClasses;

import java.util.Scanner;

public class AdaireApartments {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input number Of Bedrooms");
        int numberOfBedrooms=input.nextInt();
        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        double startingPrice = 0;
        switch (numberOfBedrooms){
            case 0: case 5:// or logic for switch
                System.out.println("Studio apartment selected");
                startingPrice=1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected" );
                startingPrice=1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice=1454;
                break;
            default:
                System.out.println(numberOfBedrooms+" bedroom currently unavailable");
                startingPrice=2899;
                break;
        }
        System.out.println("Starting Price : $"+startingPrice);
        input.close();
    }
}
