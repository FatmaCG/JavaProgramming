package day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        int maximumNumber=0;//-2147483648 ==> any user entered number will
        //be greater than -21474483648
        Scanner input=new Scanner(System.in);

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number :");
            int number=input.nextInt();
            if (number>maximumNumber){//if the user entered number is
                // greater than current maximum number
                maximumNumber=number;
            }

        }
        System.out.println("Maximum number is "+maximumNumber);
        input.close();
    }
}
