package day15_PracticeTasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!  */
        Scanner input = new Scanner(System.in);
        System.out.println("Input : ");
        String word = input.nextLine();
        int len = word.length();
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i < len; i++) {
            if ((word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') || (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
                letters = letters + word.charAt(i);
            } else if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                digits = digits + word.charAt(i);
            } else {
                char ch = word.charAt(i);
                if (ch != ' ') {
                    specialChars = specialChars + word.charAt(i);
                }
            }
        }
        System.out.println("Letters :" + letters);
        System.out.println("Digits :" + digits);
        System.out.println("Special Chars :" + specialChars);
        input.close();
    }
}
