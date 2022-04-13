package liveClasses;

import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        /*for a given grade assign Letter Grader:100-90(inclusive):A,
        89-80:B , 79-70:C ,
        69-60 :D , Below is F
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Grader : ");
        int grade = input.nextInt();
        if (grade>=0 && grade<=100){

            if (grade>=90 && grade <=100)
            {
                System.out.println("A");
            }
            else if (grade>=80 && grade <=89)
            {
                System.out.println("B");
            }
            else if (grade>=70 && grade <=79)
            {
                System.out.println("C");
            }
            else if (grade>=60 && grade <=69)
            {
                System.out.println("D");
            }
            else
            {
                System.out.println("F");
            }
        }
        else
        {
            System.out.println("Not valid Score");
        }
    }
}
//if
//ISTQB ?