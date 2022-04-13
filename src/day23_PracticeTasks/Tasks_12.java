package day23_PracticeTasks;

import java.util.Scanner;

public class Tasks_12 {
    public static void posNegOrZero(int number){
        if(number<0){
            System.out.println(number +" is negative ");
        }else if(number>0){
            System.out.println(number +" is positive ");
        }else{
            System.out.println(number +" is Zero ");
        }
    }
    //12. create a method that can if the given integer is positive, negative or zero
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number= scan.nextInt();
        posNegOrZero(number);
    }
}
