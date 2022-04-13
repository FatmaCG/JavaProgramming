package day17_PracticeTasks;

import java.util.Scanner;

public class Tasks_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int num1;
        while (true){
            System.out.println("Enter a number = ");
            num1= scan.nextInt();
            if (num1 <0) {
                break;
            }
                sum+=num1;
        }
        System.out.println(sum);
        scan.close();
    }
}
