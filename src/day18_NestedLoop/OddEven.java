package day18_NestedLoop;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number : ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }
            System.out.println("Would you like to enter another number");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes")||a.equals("no"))){ //if the answer is invalid not yes not no
                System.err.println("Invalid answer.Please re enter, would ypu like to enter another number ?");
                a=scan.next().toLowerCase();
            }
            if (a.equals("no")){
                break;
            }

        }
        scan.close();
    }
}
