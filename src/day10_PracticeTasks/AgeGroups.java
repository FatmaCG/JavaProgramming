package day10_PracticeTasks;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input your age : ");
        int age=input.nextInt();
        String result="";
        if (age>=0 && age<=150){
            if (age<21){
                result="Teenager";
            } else if (age<55) {
                result="Adult";
            }else {
                result="Senior";
            }

        }else {
            result="Invalid";
        }
        System.out.println(result);
    }
}
