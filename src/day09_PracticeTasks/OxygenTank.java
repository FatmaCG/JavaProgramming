package day09_PracticeTasks;

import java.util.Scanner;

public class OxygenTank {
    public static void main(String[] args) {
        int level;
        Scanner input=new Scanner(System.in);
        System.out.println("Oxygen Level is : ");
        level=input.nextInt();
        if(level >=90)
        {
            System.out.println("Your tank is full");
        }
        else if(level >=80)
        {
            System.out.println("Still okay");
        }
        else if(level >=70)
        {
            System.out.println("Don't go too far ");
        }
        else if(level >=60)
        {
            System.out.println("Start to head back");
        }
        else if(level >=50)
        {
            System.out.println("Be careful now you at at 50% ");
        }
    }
}
