package day39_PracticeTasks.PT2.PT_Student;

public class GraduateStudent extends Student{
    public GraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }
    public void study(){
        System.out.println(getSchoolName()+"'s student "+getName()+" is studying");
    }
}
