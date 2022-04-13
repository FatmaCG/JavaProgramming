package day15_PracticeTasks;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word=input.next();
        int len=word.length();
        String reverse="";
        for (int i = len-1; i >= 0; i--) {
            char word2=word.charAt(i);
            reverse=reverse+word2;
        }
        System.out.println(reverse);
        input.close();
    }
}
