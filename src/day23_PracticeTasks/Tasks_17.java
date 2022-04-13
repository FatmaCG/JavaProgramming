package day23_PracticeTasks;

import java.util.Arrays;

public class Tasks_17 {
    /* 17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram  */
    public static void main(String[] args) {
        String word1="silent",word2= "listen";
        anagram(word1,word2);
    }
    public static void anagram(String word11,String word22){
        char[] ch1=word11.toCharArray();
        char[] ch2=word22.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }
    }

}
