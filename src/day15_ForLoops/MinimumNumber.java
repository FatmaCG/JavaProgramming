package day15_ForLoops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        int min =2147483647; // any number that user enter will be less than 2147483647
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number : ");
            int num=input.nextInt();
            if (num<min){
                min=num;
            }
        }
        System.out.println("Minimum Number is "+min);
        input.close();
    }
}
