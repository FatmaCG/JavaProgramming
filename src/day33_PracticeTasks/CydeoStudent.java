package day33_PracticeTasks;

public class CydeoStudent {
    public String name;
    public int age,id,batchNumber;
    public char gender,grade;
    public static String schoolName,programmingLanguage;
    static {
        schoolName="Cydeo School";
        programmingLanguage="Java";
    }

    public CydeoStudent(String name, int age, int id, int batchNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+" is studying");
    }
    public void attendClass(){
        System.out.println(name+" is attending class");
    }
    public static void printSchoolName(){
        System.out.println("School Name: "+schoolName);
    }
    public static void printProgLanguage(){
        System.out.println("Programming Language: "+programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
