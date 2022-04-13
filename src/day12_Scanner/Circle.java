package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double r=scan.nextDouble();

        double area=3.14*r*r;
        double perimeter=2*3.14*r;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        scan.close();
    }
}
