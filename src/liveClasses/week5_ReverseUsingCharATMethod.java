package liveClasses;

import java.util.Scanner;

public class week5_ReverseUsingCharATMethod {
    public static void main(String[] args) {
        // what is palindrome? "madam" when you reverse : "madam" again || KAYAK is
        // palindrome , noon :palindrome PIQ for JAVA
        //check for characters word , and without methods that we didn't learn
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = input.next();
        if (word.length() == 5) {
            String reverseWord = "";
            reverseWord += word.charAt(4);
            reverseWord += word.charAt(3);
            reverseWord += word.charAt(2);
            reverseWord += word.charAt(1);
            reverseWord += word.charAt(0);
            if (word.equals(reverseWord)) {
                System.out.println("The word is Palindrome");
            } else {
                System.out.println("The word is NOT Palindrome");
            }
        } else {
            System.out.println("Word not 5 characters");
        }
        //System.out.println(reverseWord);
        input.close();

    }
}
