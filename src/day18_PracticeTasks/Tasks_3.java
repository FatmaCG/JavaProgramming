package day18_PracticeTasks;

import java.util.Scanner;

public class Tasks_3 {
    public static void main(String[] args) {
        /*3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry */
        Scanner scan = new Scanner(System.in);
        double sum=0;
        while (true) {
            System.out.println("Enter first number : ");
            int firstNumber = scan.nextInt();
            System.out.println("Enter second number : ");
            int secondNumber = scan.nextInt();
            System.out.println("Enter a math operator (+,-,/,*)");
            char operator = scan.next().charAt(0);
            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.err.println("invalid operator, please re enter : ");
                operator=scan.next().charAt(0);
            }
            if (operator == '+'){
                sum=firstNumber+secondNumber;
            }else if(operator == '-'){
                sum=firstNumber-secondNumber;
            }else if (operator == '*'){
                sum=firstNumber*secondNumber;
            }else {
                sum=firstNumber/secondNumber;
            }
            System.out.println(sum);
            System.out.println("Do you want to continue? (yes/no) : ");
            String wantContinue=scan.next().toLowerCase();
            while (!(wantContinue.equals("yes")||wantContinue.equals("no"))){
                System.err.println("invalid operator, please re enter : ");
                wantContinue=scan.next().toLowerCase();
            }
            if (wantContinue.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
              //  System.out.println(sum);
                break;
            }
        }
        scan.close();
    }
}
