package liveClasses;

import java.util.Scanner;

public class week5_emailExampleFromReplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid email : ");
        String email = input.next();

        int index0f_ = email.indexOf("_");
        int indexOfAtSign = email.indexOf("@");
        int indexOfDot = email.indexOf(".");

        String firstName = email.substring(0, index0f_);
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println(firstName);
        String lastName=email.substring(index0f_+1,indexOfAtSign);
        lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
        //  String lastName=email.substring(index0f_+1,indexOfAtSign);
        //   lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(lastName);

        String domain = email.substring(indexOfAtSign + 1, indexOfDot);
        System.out.println(domain);
        input.close();
    }
}
