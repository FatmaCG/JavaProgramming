package day16_PracticeTasks;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {
        /*2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4  */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=input.nextLine();
        System.out.println("Enter a char : ");
        char ch=input.next().charAt(0);
        int ch1=0;
        for (int i = 0; i < str.length(); i++) {
            if (ch==str.charAt(i)){
                ch1++;
            }
        }
        System.out.println(ch1);
    }
}
