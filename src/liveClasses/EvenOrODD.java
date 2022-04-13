package liveClasses;

import java.util.Scanner;

public class EvenOrODD {
    public static void main(String[] args) {
        // Task : find if a given integer is even number or odd number
        //Hint :use % operator , and control flow statements
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("input number ");
        number=input.nextInt();
        if (number%2==0)
        {
            System.out.println(number +" is Even number ");
        }
        else
        {
            System.out.println(number +" is Odd number ");
        }

    }
}
