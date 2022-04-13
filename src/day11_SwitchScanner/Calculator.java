package day11_SwitchScanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input n1 : ");
        double n1=scan.nextDouble();
        System.out.println("Input n2 : ");
        double n2=scan.nextDouble();
        //System.out.println("Input + , - , * , / : ");
        //String operator=scan.next();
        char operator='+';
        if (operator=='+' || operator=='-' || operator=='*' || operator=='/' ){
            switch (operator){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n1/n2);
                    break;
            }

        }else {
            System.err.println("Invalid operator "+operator);
            scan.close();
        }
    }
}
