package day09_PracticeTasks;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        int salary,salaryAfterTax = 0;
        
        boolean isMarried;
        Scanner input = new Scanner(System.in);
        System.out.println("Salary = ");
        salary=input.nextInt();
        System.out.println("Are you married ? (true~false) : ");
        isMarried=input.nextBoolean();
        
        if ( isMarried==true)
        {
            if (salary>=130) {
                salaryAfterTax = salary - (salary * 30 / 100);
            }
            else if (salary>=100 && salary<=130)
            {
                salaryAfterTax = salary - (salary * 25 / 100);
            }
            else if (salary>=80 && salary<=100)
            {
                salaryAfterTax = salary - (salary * 20 / 100);
            }
            else if (salary<80)
            {
                salaryAfterTax = salary - (salary * 15 / 100);
            }
        }
        else
        {
            if (salary>=130) {
                salaryAfterTax = salary - (salary * 35 / 100);
            }
            else if (salary>=100 && salary<=130)
            {
                salaryAfterTax = salary - (salary * 30 / 100);
            }
            else if (salary>=80 && salary<=100)
            {
                salaryAfterTax = salary - (salary * 25 / 100);
            }
            else if (salary<80)
            {
                salaryAfterTax = salary - (salary * 20 / 100);
            }
        }
        System.out.println("Salary After Tax is : $"+salaryAfterTax);
        
    }
}
