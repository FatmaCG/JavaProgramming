package day16_PracticeTasks;

import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {
        /*3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200  */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number :");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = 0;
        if (num1 > 0 && num2 > 0) {
            for (int i = 0; i < num2; i++) {
                result += num1;
            }
        } else {
            System.out.println("Invalid");
        }
        System.out.println(result);

    }
}
