package day08_PracticeTasks;

import java.util.Scanner;

public class EligibleCigarettes {
    public static void main(String[] args) {
        byte age;
        Scanner input=new Scanner(System.in);
        System.out.println("Please input your age : ");
        age=input.nextByte();
        if (age>+18)
        {
            System.out.println("You are eligible to buy cigarettes");
        }
        else
        {
            System.out.println("You don't buy cigarettes");
        }
        input.close();
    }
}
