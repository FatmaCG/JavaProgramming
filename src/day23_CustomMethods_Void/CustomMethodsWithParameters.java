package day23_CustomMethods_Void;

import java.util.Scanner;

public class CustomMethodsWithParameters {
    //create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){
        if (number % 2 == 0) {
            System.out.println(number+" is a even number ");
        }else{
            System.out.println(number+" is an odd number ");
        }
    }

    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age=2022-birthYear;
        System.out.println("Your age is: "+age);
    }
    //create a function that can print all the numbers between X and Y
    public  static void printNumbers(int x,int y){
        for (int i = x; i < y; i++) {
            System.out.println(i+" ");
        }

    }
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       /* System.out.println("Enter a number :");
        oddOrEven(scan.nextInt());*/
        oddOrEven(10);
      /*  System.out.println("Enter your birthyear :");
        ageOfPerson(scan.nextInt());*/
       ageOfPerson(1982);
       printNumbers(1000,2000);
    }

}
