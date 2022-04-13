package day09_PracticeTasks;

import java.util.Scanner;

public class Salary_Short {
    public static void main(String[] args) {
        boolean isMarried;
        double taxRate=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Salary = ");
        int salary=input.nextInt();
        System.out.println("Are you married ? (true~false) : ");
        isMarried=input.nextBoolean();

        if (salary>=130000) {
            taxRate=0.35;
        } else if (salary>=100000) {
            taxRate=0.30;
        } else if (salary>=80000){
            taxRate=0.25;
        } else {
            taxRate=0.20;
        }
         if (isMarried==true){
             taxRate-=0.05;
         }
         double salaryAfterTax = salary - (salary*taxRate);
        System.out.println("Salary After Tax = "+salaryAfterTax);
    }
}
