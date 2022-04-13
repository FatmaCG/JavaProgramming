package day16_PracticeTasks;

import java.util.Scanner;

public class Tasks1 {
    public static void main(String[] args) {
        /*1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative   */
        Scanner input=new Scanner(System.in);
        int poz=0,neg=0;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number : ");
            int num=input.nextInt();
            if (num>0){
                poz++;
            }else if (num<0){
                neg++;
            }
        }
        System.out.println(poz+ " positive and "+neg+" negative");
        input.close();
    }
}
