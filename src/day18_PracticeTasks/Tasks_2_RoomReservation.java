package day18_PracticeTasks;

import java.util.Scanner;

public class Tasks_2_RoomReservation {
    public static void main(String[] args) {
        /*2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry*/
        Scanner scan = new Scanner(System.in);
        int kingBed = 120;
        int queenBed = 100;
        int singleBed = 80;
        int totalPrice = 0;
        while (true) {
            System.out.println("Which bedroom do you wants to reserve ? ");
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");
            String bedrom = scan.nextLine().toLowerCase();
            while (!(bedrom.equals("king bed") || bedrom.equals("queen bed") || bedrom.equals("single bed"))) {
                System.err.println("Invalid entry, please re-enter ");
                bedrom = scan.nextLine().toLowerCase();
            }
            System.out.println("How many nights are you staying?");
            int day = scan.nextInt();
            while (day < 1) {
                System.err.println("Invalid entry, please re-enter ");
                day = scan.nextInt();
            }
            if (bedrom.equals("king bed")) {
                totalPrice += kingBed * day;
            } else if (bedrom.equals("queen bed")) {
                totalPrice += queenBed * day;
            } else {
                totalPrice += singleBed * day;
            }
            scan.nextLine();
            System.out.println("Would you like to reserve another room? (Yes/No) ");
            String a = scan.nextLine().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid entry, please re-enter ");
                a = scan.nextLine().toLowerCase();
            }
            if (a.equals("no")) {
                System.out.println("Your total price = $" + totalPrice);
                break;
            }
        }
       /* Scanner scan = new Scanner(System.in);
        int total = 0;

        while(true) {
            System.out.println("Which room would you like to select?");
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");

            String word = scan.nextLine().toLowerCase();

            while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))) {
                System.out.println("Invalid Entry, Please Re-Enter");
                word = scan.nextLine().toLowerCase();
            } // to make sure user selected either the king bed, or queen bed or single bed

            total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

            System.out.println("Would you like to select another room?");
            String a = scan.nextLine().toLowerCase();

            while( !( a.equals("yes") || a.equals("no") ) ){ // while the answer is not valid answer
                System.out.println("Invalid Entry, please re-enter");
                System.out.println("Would you like to select another room?");
                a = scan.nextLine().toLowerCase();
            } // it stops if the answer is either ye or no

            if(a.equals("no")){
                System.out.println("Your total price is: $"+total);
                break;
            }

        } */
        scan.close();
    }
}
