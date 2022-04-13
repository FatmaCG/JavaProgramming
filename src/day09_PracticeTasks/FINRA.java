package day09_PracticeTasks;

import java.util.Scanner;

public class FINRA {
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("Input number : ");
        number=input.nextInt();
        if (number%3==0 && number%5!=0)
        {
            System.out.println("FIN");
        }
        else if (number%5==0 && number%3!=0)
        {
            System.out.println("RA");
        }
        else if (number%3==0 && number%5==0)
        {
            System.out.println("FINRA");
        }
    }
}
