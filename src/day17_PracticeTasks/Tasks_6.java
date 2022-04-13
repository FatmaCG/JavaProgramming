package day17_PracticeTasks;

import java.util.Scanner;

public class Tasks_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scan.nextLine();
        System.out.println("Enter your gender : ");
        String gender = scan.next().toLowerCase();
        int quote = 0;
        while (!(gender.equals("female") || (gender.equals("male")))) {
            System.out.println("Invalid answer. Please re enter  your gender: ");
            gender = scan.next().toLowerCase();
        }
        System.out.println("Are you married? : ");
        String married = scan.next().toLowerCase();
        while (!(married.equals("yes") || (married.equals("no")))) {
            System.err.println("Invalid answer. Please re enter : ");
            married = scan.next().toLowerCase();
        }
        System.out.println("Enter your age : ");
        int age = scan.nextInt();
      while (age < 0 || age >= 120) {
            System.err.println("Invalid answer. Please re enter : ");
            age = scan.nextInt();
        }
        System.out.println("How many miles do you drive in a day ? :");
        int miles = scan.nextInt();
        while (miles < 5) {
            System.err.println("Invalid answer. Please re enter milage : ");
            miles = scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Would you like to have full coverage or liability insurance ");
        String insurance = scan.nextLine().toLowerCase();
        while (!(insurance.equals("full coverage") || insurance.equals("liability"))){
            System.out.println("Invalid answer. Please re enter : ");
            insurance = scan.nextLine().toLowerCase();
        }
        System.out.println("Have you had any accidents or claims in past 5 years (Yes / No ");
        String accident = scan.next().toLowerCase();
        while (!(accident.equals("yes") || (accident.equals("no")))) {
            System.out.println("Invalid answer. Please re enter : ");
            accident = scan.next().toLowerCase();
        }
        System.out.println("Your car has an anti-theft device (Yes/No)");
        String device = scan.next().toLowerCase();
        while (!(device.equals("yes") || (device.equals("no")))) {
            System.out.println("Invalid answer. Please re enter : ");
            device = scan.next().toLowerCase();
        }
        if (insurance.equals("liability")) {
            if (age < 25) {
                quote += 90;
            } else {
                quote += 50;
            }
            if (miles > 50) {
                quote += 50;
            } else if (miles < 10 ) {
                quote += 30;
            } else {
                quote += 10;
            }
        } else if (insurance.equals("coverage")) {
            if (age < 25) {
                quote += 160;
            } else {
                quote += 120;
            }
            if (miles >50) {
                quote += 70;
            } else if (miles > 10 ) {
                quote += 40;
            } else {
                quote += 20;
            }
        }
        if (device.equals("yes")) {
            quote -= quote * 0.05;
        }
        if (accident.equals("yes")) {
            quote += quote * 0.15;
        } else {
            quote -= quote * 0.15;
        }
        if (married.equals("yes")) {
            quote -= quote * 0.05;
        }
        System.out.println("Your insurance quote : " + quote);
        scan.close();
    }
}
