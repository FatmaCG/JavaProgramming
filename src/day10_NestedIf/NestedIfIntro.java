package day10_NestedIf;

import java.util.Scanner;

public class NestedIfIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input score : ");
        int score=input.nextInt();
        if(score>=0 && score<=100)
        {
            if (score>=60)
            {
                System.out.println("Passed");
            }
            else
            {
                System.out.println("Failed");
            }
        }
        else
        {
            System.out.println("Invalid score");
        }

        System.out.println("---------------");
        boolean hasId=true;
        System.out.println("Input your age : ");
        int age=input.nextInt();
        if(hasId)
        {
            if (age>=21)
            {
                System.out.println("Eligible to buy alcohol");
            }
            else
            {
                System.out.println("Not eligible to buy alcohol");
            }

        }
        else
        {
            System.out.println("You must have an ID to buy alcohol");
        }

        System.out.println("---------------------------");
        System.out.println("Input number : ");
        int number=input.nextInt();
        if (number>=1 && number<=7)
        {
            if (number==1)
            {
                System.out.println("Monday");
            }
            else if (number==2)
            {
                System.out.println("Tuesday");
            }
            else if (number==3)
            {
                System.out.println("Wednesday");
            }
            else if (number==4)
            {
                System.out.println("Thursday");
            }
            else if (number==5)
            {
                System.out.println("Friday");
            }
            else if (number==6)
            {
                System.out.println("Saturday");
            }
            else
            {
                System.out.println("Sunday");
            }
        }
        else
        {
            System.out.println("Invalid Number");
        }






    }
}
