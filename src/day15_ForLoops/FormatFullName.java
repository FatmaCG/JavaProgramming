package day15_ForLoops;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String firstName = input.next();
        System.out.println("Enter last name : ");
        String lastName = input.next();

        //firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        //                    C                             + ydeo    ===>"Cydeo"

        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
        //        "C"                                    +  "ydeo"  ==> Cydeo

        // lastName=(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        input.close();

    }
}
