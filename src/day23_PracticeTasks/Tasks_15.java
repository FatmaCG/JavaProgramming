package day23_PracticeTasks;

import java.util.Scanner;

public class Tasks_15 {
    //15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
    public static void calculator(int num11,int num22, char op){
        String result="";
        if (op=='+'||op=='-'||op=='*'||op=='/'){
            if (op=='+'){
                result="Addition : "+(num11+num22);
            }else if (op=='-'){
                result="Subtraction : "+(num11-num22);
            }else if (op=='*'){
                result="Multiplication : "+(num11*num22);
            }else {
                result="Division : "+(num11/num22);
            }
        }else{
            result="Invalid";
        }
        System.out.println(result);

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1=scan.nextInt();
        int num2= scan.nextInt();
        System.out.println("Enter math operator ( + , - , * , / )");
        char operator=scan.next().charAt(0);
        calculator(num1,num2,operator);

    }
}
