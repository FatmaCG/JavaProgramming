package day10_PracticeTasks;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input Salary : ");
        int salary=input.nextInt();
        System.out.println("Input Credit score : ");
        int score=input.nextInt();

        String result=(salary>=60000 && score>=650)?"Loan Approved" :"Loan Denied";
        System.out.println(result);

    }
}
