package liveClasses;

import java.util.Scanner;

public class Week6_EncryptPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password =");
        String pass = scan.next();
        String pass2 = "";
        for (int i = 0; i < pass.length(); i++) {
            pass2 += pass.charAt(i) + "x";
        }
        System.out.println(pass2);
    }
}
