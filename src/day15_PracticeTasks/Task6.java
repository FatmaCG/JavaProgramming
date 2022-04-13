package day15_PracticeTasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...       */
        Scanner input = new Scanner(System.in);
        System.out.println("Please input : ");
        String word = input.next();
        int sum = 0;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += ch - 48;
            }
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}
