package day14_PracticeTasks;

import java.util.Scanner;

public class Tasks_3 {
    public static void main(String[] args) {
        /*3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code   */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word=input.next();
        char a=word.charAt(0);
        if (a=='x'){
            word=word.substring(1);
            System.out.println(word);
        }else{
            System.out.println("the word doesn't stars with x ");
        }
        input.close();

    }
}
