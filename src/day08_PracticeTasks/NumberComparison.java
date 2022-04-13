package day08_PracticeTasks;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        int number1,number2;
        Scanner input=new Scanner(System.in);
        System.out.println("Input first number : ");
        number1=input.nextInt();
        System.out.println("Input second number : ");
        number2=input.nextInt();
        if (number1>number2)
        {
            System.out.println(number1+" is maximum number ");
        }
        else if (number2>number1)
        {
            System.out.println(number2+" is maximum number ");
        }
        else
        {
            System.out.println("Equal");
        }
        input.close();
    }
}
