package day10_NestedIf;

import java.util.Scanner;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input score : ");
        int score=input.nextInt();
        /*if (score >= 0 && score <= 100)
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
            System.out.println("Invalid Score");
        }*/

        String result= (score >= 0 && score <=100)?  (score >= 60 )?  "Passed " : "Failed"  : "Invalid score ";
        System.out.println(result);

    }


}
