package day10_NestedIf;

import java.util.Scanner;

public class NameOfMonth2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number 1 ~ 12 : ");
        int n=input.nextInt();

        String result=  n == 1? "Jan" : n == 2? "Feb" :( n == 3 )? "March" :( n == 4 )? "April" :( n == 5 )? "May"
                :( n == 6 )? "Jun" :( n == 7)? "Jul" :( n == 8)? "Aug" :( n ==9 )? "Sep" :( n == 10)? "Oct"
                :( n == 11)? "Nov" : "Dec" ; // :(n==8)? parantezler sart degil    :n==3?   :(n==3)? aysi anlamda
        System.out.println(result);
    }
}
