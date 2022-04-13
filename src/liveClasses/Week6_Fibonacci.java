package liveClasses;

import java.util.Scanner;

public class Week6_Fibonacci {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("What is the teem number for fibonacci number = ");
        int n= scan.nextInt();
        int num1 = 0, num2 = 1;
        int sum=0;
        String series = "" + num1 + " " + num2 + " ";
        for (int i = 2; i <=n; i++) {
            sum = num1 + num2;  // think of variables as buckets
            num1 = num2;
            num2 = sum;
            series+=sum+" ";
        }
        System.out.println("series ="+series);
        System.out.println("final number in the squence is : "+num2);
        scan.close();
    }
}
