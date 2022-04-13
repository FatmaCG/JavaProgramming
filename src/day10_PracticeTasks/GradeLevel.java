package day10_PracticeTasks;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Grade Level : ");
        byte gradeLevel=input.nextByte();
        String result="";
        if (gradeLevel>=1 && gradeLevel<=18){
            if (gradeLevel>=1 && gradeLevel<=5){
                result="Elementary School";
            }else if (gradeLevel>=6 && gradeLevel<=8){
                result="Middle School";
            }else if (gradeLevel>=9 && gradeLevel<=12){
                result="High School";
            }else if (gradeLevel>=13 && gradeLevel<=16){
                result="Collage";
            }else {
                result="Grade School";
            }
        }else {
            result="Invalid grade number ";
        }
        System.out.println(result);
    }
}
