package day19_LoopPractices;

import java.util.Scanner;

public class Tasks_4 {
    public static void main(String[] args) {
        //Write a program that can return the index number of the first unique character
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str= scan.next();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char each=str.charAt(j);
                if (ch==each){
                    count++;
                }
            }
            if (count==1){
                System.out.println(i);
                System.exit(0);
            }

        }

    }
}
