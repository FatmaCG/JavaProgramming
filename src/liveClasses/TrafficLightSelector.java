package liveClasses;

import java.util.Scanner;

public class TrafficLightSelector {
    public static void main(String[] args) {
       // Scanner input=new Scanner(System.in);
       // System.out.println("Input colour : ");
        char color ='r';
        switch (color){
            case 'R': case 'r':
                System.out.println("Red Light ");
                break;
            case 'O': case 'o':
                System.out.println("Orange Light ");
                break;
            case 'G': case 'g':
                System.out.println("Green Light ");
                break;
            default:
                System.out.println("Invalid Light ");
                break;

        }
    }
}
