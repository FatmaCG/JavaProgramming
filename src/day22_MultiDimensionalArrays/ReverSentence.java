package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverSentence {
    public static void main(String[] args) {
        // Write a program that can reverse the sentence
        // Java learn to day good a is Today
        String sentence = "Today is a good day to learn Java";
        String[] words = sentence.split(" ");
        String reverseSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence += words[i] + " ";
        }

        /*for (int i = 0; i < words.length/2; i++) {
            reverseSentence=words[i];
            words[i]=words[words.length-1-i];
            words[words.length-1-i]=reverseSentence;
        }*/
        System.out.println(reverseSentence);
        //  System.out.println(Arrays.toString(words));
    }
}
