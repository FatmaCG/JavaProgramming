package liveClasses;

import java.util.Scanner;

public class week5_EmailcheckInterview {
    public static void main(String[] args) {
        /*Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false */
        /*indexof("@")<1 :  0 (no character before @ sign) or -1 (there is no @ sign)
        indexof("@") >= email.length()-3   (a@a.a: indexof("@):length()-4 )
        what if we have 2 @ signs :
        the index of @ sign == last index of @ sign: there is one @ sign, otherwise problem
        DOT Conditions
        indexof(".")<1 :  0 (no character before dot sign) or -1 (there is no dot sign)
        indexofDotSign == email.length()-1 : problem
        the index of @ sign > bigger than indexofDotSign: problem
        the index of @ sign + 1 ==  indexofDotSign (@.): there is no character in between : problem*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please put a valid email address : test@example.com ");
        String email = input.next();
        /* if (email.indexOf("@")>=1 && email.indexOf(".")>(email.indexOf("@"))){
            System.out.println("email is valid");
        }else{
            System.out.println("email is invalid");
        }*/
        input.close();
        boolean result = true;

        int atSignIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");

        if (atSignIndex < 1 // 0 (no character before @ sign) or -1 (there is no @ sign)
                || atSignIndex >= email.length() - 3   // (a@a.a: indexof("@):length()-4 )
                || atSignIndex != email.lastIndexOf("@")) // there is one @ sign, otherwise problem DOT Conditions
        {
            result = false;
        }
        if (dotIndex < 1 //  0 (no character before dot sign) or -1 (there is no dot sign)
                || dotIndex == email.length() - 1  //checking if it is last character
                || atSignIndex > dotIndex   //checking if @ sign is before dot sign
                || atSignIndex + 1 == dotIndex) // checking if there is a character between @ sign and dot sign
             {
            result = true;
        }
        System.out.println("result = " + result);

    }
}
