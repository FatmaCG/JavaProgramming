package day23_PracticeTasks;

import java.util.Scanner;

public class Tasks_6_and_7 {
    //6. create a method that can calculate the area of a circle
    public static void areaOfCircle(int r){
        double area=3.14*r*r;
        System.out.println("Area of a circle :"+area);
    }

    //	7. create a method that can calculate the area of a square
    public static void areaOfSquare(int a){
        System.out.println("Area of a square :"+(a*a));
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a cirle r :");
        areaOfCircle(scan.nextInt());
        System.out.println("Enter a square a :");
        areaOfSquare(scan.nextInt());
    }
}
