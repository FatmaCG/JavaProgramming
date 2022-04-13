package day20_Arrays;

import java.util.Scanner;

public class AvarageNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter ? ");
        int length= scan.nextInt();
        if (length<=0){
            System.err.println("Invalid Entry ");
            System.exit(0);
        }
       double sum=0;
        int[] numbers=new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number :");
            numbers[i]=scan.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }

        double avareNumber=sum/length;
        System.out.println(avareNumber);
    }
}
