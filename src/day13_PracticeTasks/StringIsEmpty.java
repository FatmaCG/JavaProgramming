package day13_PracticeTasks;

import java.util.Scanner;

public class StringIsEmpty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=input.next();
        int len=str.length();
        if (len>3){
            int a=str.length()-3;
            int b=str.length()-2;
            int c=str.length()-1;
            char ch1=str.charAt(a);
            char ch2=str.charAt(b);
            char ch3=str.charAt(c);
            System.out.print(ch1);
            System.out.print(ch2);
            System.out.print(ch3);
        }else if (len<=3){
            System.out.println(str);
        }else {
            System.out.println("string is empty ");
        }
        input.close();


        /*Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself */
    }
}
