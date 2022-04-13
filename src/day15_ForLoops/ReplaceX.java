package day15_ForLoops;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        System.out.println("Enter a word : ");
        String word=new Scanner(System.in).next();

        word=word.replace("x","a").replace("X","a");
        //       "acodeX"                             "acodea"

        System.out.println(word);
    }
}
