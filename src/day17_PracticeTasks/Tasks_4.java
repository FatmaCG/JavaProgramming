package day17_PracticeTasks;

import java.util.Scanner;

public class Tasks_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0 && i % 3 == 0) {
                divisibleBy15 += i + " ";
            }
            if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5 += i + " ";
            }
            if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3 += i + " ";
            }
        }
        System.out.println("Divisible by 15: " + divisibleBy15);
        System.out.println("Divisible by 5: " + divisibleBy5);
        System.out.println("Divisible by 3: " + divisibleBy3);

       /* if (num%3==0 && num%5==0){
            System.out.println("Divisibel By 15");
            for (int i = 0; i < num; i+=15) {
                System.out.print(i+" ");
            }
        }else if (num%3==0){
            System.out.println("Divisibel By 3");
            for (int i = 0; i < num; i+=3) {
                System.out.print(i+" ");
            }
        }else if (num%5==0){
            System.out.println("Divisibel By 5");
            for (int i = 0; i < num; i+=5) {
                System.out.print(i+" ");
            }
        }*/
        scan.close();
    }
}
