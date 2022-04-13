package day15_PracticeTasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str = input.nextLine();
        int len = str.length();
        String reverse = "";
        for (int i = len-1; i >=0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        input.close();
    }
}
