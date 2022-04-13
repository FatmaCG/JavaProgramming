package day17_PracticeTasks;

import java.util.Scanner;

public class Tasks_3 {
    public static void main(String[] args) {
        /*write a program to ask user to enter two number and math operator, and return the result.
		if the operator is invalid operator, ask user to re-enter the operator
		until user provides a valid operator (+, -, *, /) */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num1=scan.nextInt();
        int num2= scan.nextInt();
        System.out.println("Enter operator (+, -, *, /) : ");
        String op= scan.next();
       while (!(op.equals("+")||op.equals("-") || op.equals("*") || op.equals("/"))){
            System.out.println("The operator is invalid operator, re-enter the operator ");
            op=scan.next();
        }
        if (op.equals("+")){
            System.out.println(num1+num2);
        }else if (op.equals("-")){
            if (num1>num2){
                System.out.println(num1-num2);
            }else {
                System.out.println(num2-num1);
            }
        }else if (op.equals("*")){
            System.out.println(num1*num2);
        }else{
            if (num1>num2){
                System.out.println(num1/num2);
            }else {
                System.out.println(num2/num1);
            }
        }
        scan.close();
    }
}
