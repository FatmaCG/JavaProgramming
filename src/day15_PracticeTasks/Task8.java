package day15_PracticeTasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /* 8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true    */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word = ");
        String str = input.nextLine();
        int len = str.length();
        String reverse = "";
        for (int i = len - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        input.close();
    }
}
