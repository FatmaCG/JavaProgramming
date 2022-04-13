package day11_SwitchScanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input 1 ~ 7 : ");
        int number=input.nextInt();
        String result="";
        switch (number){
            case 1:
                result="Monday";
                break;
            case 2:
                result="Tuesday";
                break;
            case 3:
                result="Wednesday";
                break;
            case 4:
                //System.out.println("Thursday");
                result="Thursday";
                break;
            case 5:
                result="Friday";
               // System.out.println("Friday");
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
                break;
            default:
                result="Invalid";
                break;
        }
        System.out.println(result);
    }


}
