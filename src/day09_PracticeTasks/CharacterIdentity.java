package day09_PracticeTasks;

import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {
        int ch;
        Scanner input=new Scanner(System.in);
        System.out.println("ch = ");
        ch=input.nextInt();
        if (ch>=65&&ch<=90 || ch>=97&&ch<=122)
        {
            System.out.println("Alphabetic Character");
        }
        else if (ch>=48&&ch<=57 )
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Character");
        }

    }
}
