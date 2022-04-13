package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter your username: ");
        String username = scan.next();

        System.out.println("Enter your password: ");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in ");
        } else {
            int attempts = 3;
            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0) {
                if (attempts==1){
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }
                System.out.println("Incorrect username or password , please re-enter ");
                System.out.println(" Enter your username: ");
                username = scan.next();
                System.out.println("Enter your password: ");
                password = scan.next();
                attempts--;
            }
            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in ");
            } else {
                System.out.println("Your account is locked.");
            }
        }
        scan.close();
    }
}
