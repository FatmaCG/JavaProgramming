package day15_PracticeTasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number for factorial : ");
        int num=input.nextInt();
        int factorial=1;
        for (int i = num; i >=1 ; i--) {
            factorial*=i;
        }
        System.out.println(factorial);
        input.close();
    }
}
