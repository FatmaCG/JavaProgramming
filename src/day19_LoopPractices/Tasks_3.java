package day19_LoopPractices;

import java.util.Scanner;

public class Tasks_3 {
    public static void main(String[] args) {
        // Write a program that can display all the characters that appeared twice in the string
        //          String str="aaabbccccccddeeeeeee"
        //           result=bd ;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str=scan.next();
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char each=str.charAt(j);
                if (ch==each){
                    count++;
                }
            }
            if(result.contains(""+ch)){
                continue;
            }
            if (count==2){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
