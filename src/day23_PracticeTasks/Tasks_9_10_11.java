package day23_PracticeTasks;

import java.util.Scanner;

public class Tasks_9_10_11 {
    //  9. create a method that can convert dollar to euro
    public static void dollarToEuro(int dollar){
        double result=dollar*0.91;
        System.out.println("$"+dollar+ " is €"+result+" Euro.");
    }

    //	10. create a method that can can convert dollar to lira
    public static void dollarToTl(int dollar){
        double result=dollar*14.66;
        System.out.println("$"+dollar+" is "+result+" TL");
    }

    //	11. create a method that can convert kg to lb
    public static void kgToLb(int kg){
        double result2=kg*2.20462262;
        System.out.println(kg +" kg is "+result2+" lbs.");
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a dollar : ");
        int dollar=scan.nextInt();
        System.out.println("Enter a kg");
        int kg=scan.nextInt();
        dollarToEuro(dollar);
        System.out.println();
        dollarToTl(dollar);
        System.out.println();
        kgToLb(kg);
    }


}
