package day09_PracticeTasks;

import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args) {
        int time;
        Scanner input=new Scanner(System.in);
        System.out.println("Time (1~24 ) = ");
        time = input.nextInt();
        if (time>=8 && time<=23)
        {
            System.out.println("OPEN");
        }
        else
        {
            System.out.println("CLOSED");
        }
    }
}
