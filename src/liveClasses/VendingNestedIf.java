package liveClasses;

import java.util.Scanner;

public class VendingNestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input drink or snack : ");
        String selection = input.nextLine();
        if (selection.equals("drink")) {
            System.out.println("Drink option is selected ");
            System.out.println("Input teo or coke : ");
            String drink2 = input.nextLine();
            if (drink2.equals("tea")) {
                System.out.println("tea is selected");
            } else if (drink2.equals("coke")) {
                System.out.println("coke is selected");
            } else {
                System.out.println("invalid drink");
            }

        } else if (selection.equals("snack")) {
            System.out.println("Snack option is selected ");
            System.out.println("Input chips or candy : ");
            String snack2 = input.nextLine();
            if (snack2.equals("chips")) {
                System.out.println("chips is selected");
            } else if (snack2.equals("candy")) {
                System.out.println("candy is selected");
            } else {
                System.out.println("invalid snack");
            }
        } else {
            System.err.println("Invalid Entry");
        }
        if (false)
            System.out.println("Hello");
            System.out.println("Running");
            input.close();
    }
}
