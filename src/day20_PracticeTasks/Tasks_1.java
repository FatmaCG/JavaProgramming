package day20_PracticeTasks;

import java.util.Scanner;

public class Tasks_1 {
    public static void main(String[] args) {
        /*1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines  */
        String[] classmates = {"Ali Guler", "Fatma Guler", "Meryem Guler", "Meltem Guler", "Huseyin Cekim",
                "Meryem Cekim", "Berra Guler", "Rana Guler", "Mahmut G", "Hamdiye G"};

        for (int i = 0; i < classmates.length; i++) {
           System.out.println(classmates[i].charAt(0)+"."+classmates[i].charAt(classmates[i].indexOf(" ")+1));

           // String initial = classmates[i].charAt(0) +"."+ classmates[i].charAt(  classmates[i].indexOf(" ") + 1);
           // System.out.println(initial);
        }
    }
}
