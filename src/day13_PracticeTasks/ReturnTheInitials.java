package day13_PracticeTasks;

import java.util.Scanner;

public class ReturnTheInitials {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two words : ");
        String str1=input.next();
        String str2=input.next();

         str1=str1.toUpperCase();
         str2=str2.toUpperCase();


        System.out.println(str1.charAt(0) +"."+str2.charAt(0));
        input.close();

        /*write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output  */


    }
}
