package day13_PracticeTasks;

import java.util.Scanner;

public class SamaCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = input.next();
        char firstChr = str.charAt(0);
        char lastChr = str.charAt(str.length() - 1);
        if (firstChr == lastChr) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        input.close();

    }
    /*write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same*/

}
