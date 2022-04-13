package day13_PracticeTasks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = input.next();
        int len = word.length();
        if (len > 5) {
            System.out.println("Too long!");
        } else if (len < 5) {
            System.out.println("Too short!");
        } else {
            char a = word.charAt(0);
            char b = word.charAt(1);
            char c = word.charAt(2);
            char d = word.charAt(3);
            char e = word.charAt(4);
            System.out.print(e);
            System.out.print(d);
            System.out.print(c);
            System.out.print(b);
            System.out.println(a);
        }
        input.close();
        /* Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.*/
    }
}
