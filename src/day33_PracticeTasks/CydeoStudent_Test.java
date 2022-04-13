package day33_PracticeTasks;

public class CydeoStudent_Test {
    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("Fatma",39,1234,8,'F','A');

        CydeoStudent student2=new CydeoStudent("Ali",42,234,8,'M','B');

        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student2.printProgLanguage();

    }
}
