package day14_PracticeTasks;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        /*Create a class called EmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com   */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email=input.next();
        int index=email.indexOf("_");
        if (index>=0){
            String firstName=email.substring(0,index);
            String secondName=email.substring(index+1,(email.indexOf("@")));
            String domain=email.substring(email.indexOf("@"));

            System.out.println(secondName+"_"+firstName+domain);
        }else{
            System.out.println(email);
        }
        input.close();
    }
}
