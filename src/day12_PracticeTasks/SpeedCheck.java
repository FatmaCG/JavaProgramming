package day12_PracticeTasks;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        int speedLimit=55;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the current speed : ");
        int currentSpeed=input.nextInt();
        int fast=currentSpeed-speedLimit;
        if (currentSpeed>speedLimit){
            System.out.println("You're driving "+fast +" mph over the limit. Slow down");
        }
        input.close();
        /*Write a program for the speed check. a variable named speedLimit is given
         and assigned, ask user to enter the current speed, if the current speed is
         over the speedLimit print slow down, otherwise do not print anything
         */
    }
}
