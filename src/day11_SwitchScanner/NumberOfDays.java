package day11_SwitchScanner;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Input months number 1 ~ 12 : ");
        int number=input.nextInt();
        String result="";

        if (number>=1 && number<=12){
            switch (number){
                case 2:
                    System.out.println("Input year : ");
                    int year=input.nextInt();
                 /*   if(year%4==0) {
                        result = "29 Days ";
                    }
                    else{
                        result="28 Days";
                    }*/
                    result= ( year % 4 == 0)? "29 Days " :"28 Days ";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result="30 days";
                    break;
                default:
                    result="31 days";
                    break;
            }

        }
        else{
            result="Invalid";
        }
        System.out.println(result);
    }
}
