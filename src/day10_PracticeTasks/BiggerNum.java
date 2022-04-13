package day10_PracticeTasks;

import java.util.Scanner;

public class BiggerNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input 3 different numbers : ");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();

        String result=(n1>n2 && n1>n3)? "n1 is bigger " :(n2>n1 && n2>n3)? "n2 is bigger " :"n3 is bigger";
        System.out.println(result);


    }
}
