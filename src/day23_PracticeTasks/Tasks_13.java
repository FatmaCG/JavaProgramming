package day23_PracticeTasks;

import java.util.Scanner;

public class Tasks_13 {
    //13. create a method named printEachChar that can print each characters of a string
    public static void printEachChar(String wordd){
        for (int i = 0; i < wordd.length(); i++) {
            System.out.println(wordd.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String word=scan.nextLine();
        printEachChar(word);
    }
}
