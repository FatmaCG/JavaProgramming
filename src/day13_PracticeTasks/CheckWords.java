package day13_PracticeTasks;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 words : ");
        String str1=input.next();
        String str2=input.next();
        String str3=input.next();
        int l1=str1.length();
        int l2=str2.length();
        int l3=str3.length();
        if (l1==l2 && l2==l3 && l1==l3){
            System.out.println("All words are same length");
        }else if (l1!=l2 && l2!=l3 && l1!=l3){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }
        input.close();

        /*Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length" */

    }
}
