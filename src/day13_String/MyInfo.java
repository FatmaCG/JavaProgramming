package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=input.nextInt();
        System.out.println("Enter your gender :");
        String gender=input.next();
        input.nextLine();
        System.out.println("Enter your full name :" );
        String fullName=input.nextLine();
        System.out.println("Enter your phone number : ");
        Long phoneNumber=input.nextLong();
        System.out.println("Enter your zip code : ");
        int zipCode=input.nextInt();
        input.nextLine();
        System.out.println("Enter your school name : ");
        String school=input.nextLine();
        System.out.println("Enter your city name : ");
        String city=input.nextLine();
        System.out.println("Enter your state name : ");
        String state=input.next();
        System.out.println("Enter your building number : ");
        int building=input.nextInt();
        input.nextLine();
        System.out.println("Enter your street name : ");
        String street=input.nextLine();

        input.close();

        System.out.println("Full name : "+fullName);
        System.out.println("Age : " + age);
        System.out.println("Gender : "+gender);
        System.out.println("Phone number : "+phoneNumber);
        System.out.println("Adress : \n\t\t"+building+" "+street+"\n\t\t"+city+" "+state+" "+zipCode);
        System.out.println("School Name : "+school);

    }
}
