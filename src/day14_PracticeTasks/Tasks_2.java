package day14_PracticeTasks;

import java.util.Scanner;

public class Tasks_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");
        /*2. ask the user to enter a word. if the word ends with "ly", print "really???" ,
         otherwise, print "never mind"
         */
        String word=input.next();
        //String lastTwoChars=word.substring(word.length()-2);
        int len=word.length();

        String str=word.substring(len-2,len);
        if (str.equals("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }
        input.close();

    }
}
