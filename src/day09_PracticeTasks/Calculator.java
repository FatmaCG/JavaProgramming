package day09_PracticeTasks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1,n2;
        char mathOperator='+';
        Scanner input=new Scanner(System.in);
        System.out.println("n1 = ");
        n1=input.nextInt();
        System.out.println("n2 = ");
        n2=input.nextInt();
        System.out.println("Operator (- , + , * , / ) = ");
        //mathOperator=input.next();

        if (mathOperator=='-')
        {
            System.out.println(n1-n2);
        }
        else if (mathOperator=='+')
        {
            System.out.println(n1+n2);
        }
        else if (mathOperator=='*')
        {
            System.out.println(n1*n2);
        }
        else if (mathOperator=='/')
        {
            System.out.println(n1/n2);
        }
        else
        {
            System.out.println("invalid operator");
        }


    }
}
