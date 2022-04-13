package day23_PracticeTasks;

import java.util.Scanner;

public class Tasks_16 {
    /*16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name : ");
        String name=scan.nextLine();
        fullNameRegularFormat(name);
    }
    public static void fullNameRegularFormat(String namee){
        /*firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        String fullName = firstName+" "+lastName;
        System.out.println("fullName = " + fullName); */  //if first and last name 2 words
        String nam=namee.substring(0,1).toUpperCase()+namee.substring(1,namee.indexOf(" ")).toLowerCase();
        String surname=namee.substring(namee.indexOf(" ")+1,namee.indexOf(" ")+2).toUpperCase()+namee.substring(namee.indexOf(" ")+2);
        System.out.println(nam+" "+surname);
    }
}
