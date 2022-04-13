package liveClasses;

import java.util.Scanner;

public class AmazonFreeShiipng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Price : ");
        double totalPrice = scan.nextDouble();
        if (totalPrice >= 25.0) {
            System.out.println("FREE Shipping eligible.Your order total : $ " + totalPrice);
        } else {
            System.out.println("NOT Eligible for free shipping : " + totalPrice);
        }
        System.out.println("Thanks for shopping with us ! ");
        scan.close();
    }
}
