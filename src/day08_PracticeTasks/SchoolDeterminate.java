package day08_PracticeTasks;

import java.util.Scanner;

public class SchoolDeterminate {
    public static void main(String[] args) {
        byte gradeLevel;
        Scanner input=new Scanner(System.in);
        System.out.println("Please input your grade level (1-18): ");
        gradeLevel=input.nextByte();
        if (gradeLevel>=1 && gradeLevel<=5)
        {
            System.out.println("Elementary School");
        }
        else if(gradeLevel>= 6 && gradeLevel<=8)
        {
            System.out.println("Middle School");
        }
        else if(gradeLevel>= 9 && gradeLevel<=12)
        {
            System.out.println("High School");
        }
        else if (gradeLevel>= 13 && gradeLevel<=16)
        {
            System.out.println("Collage");
        }
        else if (gradeLevel>= 17 && gradeLevel<=18)
        {
            System.out.println("Grad School");
        }
        else
        {
            System.out.println("You entered wrong number ");
        }
        input.close();
    }
}
