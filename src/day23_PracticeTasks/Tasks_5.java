package day23_PracticeTasks;

public class Tasks_5 {
    //5. create a method that can calculate the grade of the student based on the score
    public static void main(String[] args) {
        gradeOfStudent(75);
    }

    public static void gradeOfStudent(int score) {
        char result = (score >= 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : (score > 60) ? 'D' : 'E';
        System.out.println("Grade "+result);
    }
}
