package day07_PracticeTasks;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate,weeklyHours;
        int stateTaxRate, federalTaxRate;
        Scanner input=new Scanner(System.in);
        System.out.println("Please input hourly rate : ");
        hourlyRate=input.nextInt();
        System.out.println("Please input weekly hours : ");
        weeklyHours=input.nextInt();
        System.out.println("Please input state tax rate : ");
        stateTaxRate=input.nextInt();
        System.out.println("Please input federal Tax rate : ");
        federalTaxRate=input.nextInt();
        int salaryBeforeTax=hourlyRate*weeklyHours*52;
        int stateTax=(salaryBeforeTax*stateTaxRate)/100;
        int federalTax=(salaryBeforeTax*federalTaxRate)/100;
        int totalTax=stateTax+federalTax;
        int salaryAfterTax=salaryBeforeTax-totalTax;
        System.out.println("Gross pay is : $"+salaryBeforeTax);
        System.out.println("Federal Tax is : $"+federalTax);
        System.out.println("State Tax is : $"+stateTax);
        System.out.println("Total Tax is : $"+totalTax);
        System.out.println("Net income is : $"+salaryAfterTax);
        input.close();
    }
}
