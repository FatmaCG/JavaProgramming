package day14_PracticeTasks;

import java.util.Scanner;

public class Tasks_4 {
    public static void main(String[] args) {
        /*4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight  */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two words : ");
        String str1=input.next();
        String str2=input.next();
        int l=str1.length();
        if ((str1.charAt(l-1))==str2.charAt(0)){
            System.out.println(str1+(str2.substring(1)));
        }else{
            System.out.println(str1+str2);
        }
        input.close();

    }
}
