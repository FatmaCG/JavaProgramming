package day17_PracticeTasks;

import java.util.Scanner;

public class Tasks_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        int num1=scan.nextInt();
        int num2= scan.nextInt();
        int count=0;
        int remainder=0;

       if (num1>num2){
           while (num1>=num2){
               num1-=num2; //num1=num1-num2
               count++;
           }
           remainder=num1%num2;

       }else {
           while (num2>=num1){
               num2-=num1;
               count++;
           }
           remainder=num2%num1;
       }
        System.out.println("count = "+count);
        System.out.println("remainder = "+remainder);


    }
}
