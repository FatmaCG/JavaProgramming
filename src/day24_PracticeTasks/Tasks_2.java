package day24_PracticeTasks;

import java.util.Arrays;

public class Tasks_2 {
    /*2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true */
    public static void main(String[] args) {
        String str1 = "cba", str2 = "bac";

        System.out.println(isAnagram(str1, str2));
    }
    public static boolean isAnagram(String str11, String str22){

        char[] ch1=str11.toCharArray();
        char[] ch2=str22.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram=Arrays.equals(ch1,ch2);
        return anagram;
    }


}
