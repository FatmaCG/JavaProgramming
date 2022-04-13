package day19_PracticeTasks;

import java.util.Scanner;

public class Tasks_5 {
    public static void main(String[] args) {
        /*5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"  */
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your hourly rate: ");
            int hourlyRate = scan.nextInt();
            if (hourlyRate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            int weeklyHour = scan.nextInt();
            if (weeklyHour < 1 || weeklyHour > 144) {
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double taxRate = scan.nextDouble();
            if (taxRate < 0 || taxRate > 10) {
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            int grossSalary = weeklyHour * hourlyRate * 52;
            System.out.println("Gross Salary : $" + grossSalary);
            double federalTax = grossSalary * 0.26;
            System.out.println("Federal Tax : $" + federalTax);
            double stateTax = grossSalary * taxRate/100;
            System.out.println("State Tax : $" + stateTax);
            System.out.println("Total Tax : $" + (stateTax + federalTax));
            System.out.println("Net Income : $" + (grossSalary - (stateTax + federalTax)));

            System.out.println("Would you like to continue?");
            String ans = scan.next().toLowerCase();

            while (!(ans.equals("yes") || ans.equals("no"))) {
                System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
                ans = scan.next().toLowerCase();
            }
            if (ans.equals("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }
        }
        scan.close();
    }
}
