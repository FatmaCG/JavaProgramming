package day19_PracticeTasks;

import java.util.Scanner;

public class Tasks_3 {
    public static void main(String[] args) {
        /*Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry */
        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.println("Enter the length of the Rectangle:");
            int length=scan.nextInt();
            if (length<=0){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter the width of the Rectangle:");
            int width=scan.nextInt();
            if (width<=0){
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }
            System.out.println("Area of rectangle : "+(length*width));
            System.out.println("Perimeter of rectangle : "+(2*(length+width)));
            System.out.println("Would you like to calculate another Rectangle?");
            String ans=scan.next().toLowerCase();
            while (!(ans.equals("yes")||ans.equals("no"))){
                System.err.println("Invalid answer , please re-enter : ");
                ans=scan.next().toLowerCase();
            }
            if (ans.equals("no")){
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
             //  System.exit(0);
                break;
            }/*else{
                continue;
            }*/

        }
        scan.close();
    }
}
