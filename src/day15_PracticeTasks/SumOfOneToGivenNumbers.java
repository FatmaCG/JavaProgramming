package day15_PracticeTasks;

import java.util.Scanner;

public class SumOfOneToGivenNumbers {
    public static void main(String[] args) {
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=input.nextInt();
        for (int i = 1; i <=num ; i++) {
            sum+=i; //sum=sum+i;
        }
        System.out.println("Sum of 1 to "+num+" is "+sum);
    }
}
