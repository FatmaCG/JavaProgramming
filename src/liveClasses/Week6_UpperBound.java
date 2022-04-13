package liveClasses;

import java.util.Scanner;

public class Week6_UpperBound {
    public static void main(String[] args) {
        int calculater = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid upper bound ");
        int num = scan.nextInt();
        boolean check = true;  // initialization
        for (; check; ) {
            if (num >= 1) {
                for (int i = 1; i <= num; i++) {
                    calculater += i;
                }
                check = false;  // iteration (yineleme )
            } else {
                System.out.println("Please Enter a valid Number again ");
                num = scan.nextInt();
                check = true; //iteration
            }
        }
        System.out.println("sum = " +calculater);
    }
}