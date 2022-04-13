package day13_PracticeTasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)?");
        String split=input.next(); // input.next().toLowerCase();
        System.out.println("Enter the number of people");
        int people=input.nextInt();
        System.out.println("Enter the check amount : ");
        int amount=input.nextInt();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality=input.next().toLowerCase();
        double totalPay=0;
        double totalTip=0;
        double totalPerPerson=0;
        double tipPerPerson=0;
        if (split.equals("Yes") || split.equals("yes")){
            if (quality.equals("Poor")){
                totalTip=amount*0.05;
            }else if (quality.equals("Fair")){
                totalTip=amount*0.1;
            }else if (quality.equals("Good")){
                totalTip=amount*0.15;
            }else if (quality.equals("Great")){
                totalTip=amount*0.2;
            }else if (quality.equals("Excellent")){
                totalTip=amount*0.25;
            }
            totalPay=amount+totalTip;
            totalPerPerson=totalPay/people;
            tipPerPerson=totalTip/people;
            System.out.println("Number of people entered: "+people);
            System.out.println("Total to pay:"+totalPay);
            System.out.println("Total tip:"+totalTip);
            System.out.println("Total per person:"+totalPerPerson);
            System.out.println("Tip per person:"+tipPerPerson);
        }else if (split.equals("No") || (split.equals("no"))){
            if (quality.equals("Poor")){
                totalTip=amount*0.05;
            }else if (quality.equals("Fair")){
                totalTip=amount*0.1;
            }else if (quality.equals("Good")){
                totalTip=amount*0.15;
            }else if (quality.equals("Great")){
                totalTip=amount*0.2;
            }else if (quality.equals("Excellent")){
                totalTip=amount*0.25;
            }
            totalPay=amount+totalTip;
            System.out.println("Number of people entered: "+people);
            System.out.println("Total to pay:"+totalPay);
            System.out.println("Total tip:"+totalTip);
        }

        
        /*2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of
the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method */

    }
}
