package day14_PracticeTasks;

import java.util.Scanner;

public class Tasks_1 {
    public static void main(String[] args) {
        /*1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two words: ");
        String str1=input.next();
        String str2=input.next();
        String str11=str1.substring(1);
        String str22=str2.substring(1);

        System.out.println(str11+str22);
        input.close();


    }
}
