package day16_ForLoopStringPractice;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str=input.next();
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
