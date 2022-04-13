package day13_PracticeTasks;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string one : ");
        String str1 = input.next();
        System.out.println("Enter string two : ");
        String str2 = input.next();

        if (str1.length() > str2.length()) {
            System.out.println("Longest String is " + str1);
        } else {
            System.out.println("Longest String is " + str2);
        }

        input.close();
        /*write a program that asks user to enter two strings, and print out the longest string  */
    }
}
