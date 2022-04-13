package day10_NestedIf;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input Score ");
        int score=input.nextInt();
        if (score>=0 && score<=100)
        {
            if (score>=90 )
            {
                System.out.println("Excellent");
            }
            else if (score>=80)
            {
                System.out.println("Great");
            }
            else if (score>=70 )
            {
                System.out.println("Good");
            }
            else if (score>=60 )
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
            System.out.println("Invalid Score");
        }

        System.out.println("---------------------------------");
        String result=""; // temporary
        if (score>=0 && score<=100)
        {
            if (score>=90 )
            {
                result="Excellent";
            }
            else if (score>=80)
            {
                result="Great";
            }
            else if (score>=70 )
            {
                result="Good";
            }
            else if (score>=60 )
            {
               result="Passed";
            }
            else
            {
                result="Failed";
            }

        }
        else
        {
            result="Invalid Score";
        }
        System.out.println(result);

    }
}
