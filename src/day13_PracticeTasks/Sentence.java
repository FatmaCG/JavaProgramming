package day13_PracticeTasks;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        /*write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence */
        char firstCharacter = sentence.charAt(0);
        char lastCharacter = sentence.charAt(sentence.length() - 1);
        System.out.println("First character is " + firstCharacter + "\nLast character is " + lastCharacter);
        input.close();


    }
}
