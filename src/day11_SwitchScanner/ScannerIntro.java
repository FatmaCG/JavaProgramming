package day11_SwitchScanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int num1=input.nextInt();
        System.out.println("Enter a Double : ");
        double num2=input.nextDouble();

        System.out.println("Multipication : "+num1*num2);
        input.close(); // close the scanner.After this scanner can not be used anymore

    }
}
