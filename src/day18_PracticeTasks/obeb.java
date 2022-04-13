package day18_PracticeTasks;

import java.util.Scanner;

public class obeb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer : ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scan.nextInt();
        int ebob = 1;
        if (num1 < num2) {
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
            }
        } else {
            for (int i = 1; i < num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
            }
        }
        System.out.println(ebob);
    }
}

