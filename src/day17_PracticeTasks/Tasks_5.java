package day17_PracticeTasks;

import java.util.Scanner;

public class Tasks_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you want to reserve a room ? ");
        String ans= scan.next().toLowerCase();
        while (!(ans.equals("yes")|| ans.equals("no"))){
            System.err.println("Invalid answer. Please re enter : ");
            ans=scan.next().toLowerCase();
        }
        if(ans.equals("yes")){
            System.out.println("Which type of room you want to reserve ? (King Bed / Queen Bed / Single Bed");
            String bed=scan.next().toLowerCase();
            if (bed.equals("king")){
                System.out.println("You prefer King Bed $"+120);
            }else if (bed.equals("queen")){
                System.out.println("You prefer Queen Bed $"+100);
            }else if (bed.equals("single")){
                System.out.println("You prefer Single Bed $"+80);
            }

        }else{
            System.out.println("Have a nice day ");
        }
        scan.close();

    }
}
