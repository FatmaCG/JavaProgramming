package day39_PracticeTasks.PT2.PT_Student;

public class StudentObjects {
    public static void main(String[] args) {
        Student student = new Student("Meryem", 8, 'F', 123, "CoE", 'A', "Church of England");
        student.study();
        CydeoStudent cydeoStudent=new CydeoStudent("Fatma",39,'F',234,"library",'A',"Cydeo",8,14,"Java");
        System.out.println(cydeoStudent);

        GraduateStudent graduateStudent=new GraduateStudent("Meltem",6,'F',234,"ces",'A',"Church of England");
        graduateStudent.study();

        UndergraduateStudent aaa=new UndergraduateStudent("Ali",42,'M',456,"cyd",'A',"CYDEO");
        aaa.study();
    }
}
