package day20_Arrays;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter ? ");
        int length= scan.nextInt();

        if (length<1){
            System.err.println("Invalid Entry ");
            System.exit(0);
        }
        int[] numbers=new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number :");
            numbers[i]= scan.nextInt();
        }
        int min=numbers[0];
        int max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min=numbers[i];
            }
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("min number "+ min);
        System.out.println("max = " + max);
    }
}
