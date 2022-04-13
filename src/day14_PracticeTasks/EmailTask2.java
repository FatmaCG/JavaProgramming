package day14_PracticeTasks;

import java.util.Scanner;

public class EmailTask2 {
    /* 8. Create a class called EmailTask2.
    Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that will print out information about user based on email. Print first name, last name, and domain.

    First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

    Ex:
    input:
    craig_federighi@apple.com

    Output:
    First name: Craig
    Last name: Federighi
    Domain: apple  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email = input.next();
        String name = email.substring(0, email.indexOf("_"));
        String surname = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        String f = (name.toUpperCase()).substring(0,1);
        name=(name.toLowerCase()).substring(1);
        String s=(surname.toUpperCase()).substring(0,1);
        surname =( surname.toLowerCase()).substring(1);
        System.out.println("First Name : "+f+name);
        System.out.println("Last Name : " + s+surname);
        System.out.println("Domain : "+domain);
        input.close();
    }
}
