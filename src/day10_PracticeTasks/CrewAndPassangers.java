package day10_PracticeTasks;

import java.util.Scanner;

public class CrewAndPassangers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input number of people on the ship : ");
        int number=input.nextInt();
        String result="";
        if( number == 50 || number == 75 || number == 100)
        {
            if ( number == 50 ){
                result="20 crew , 30 passengers";
            }else if (number == 75){
                result="25 crew , 50 passengers";
            }else {
                result="30 crew , 70 passengers";
            }
        }else {
            result="Not valid";
        }
        System.out.println(result);
    }
}
