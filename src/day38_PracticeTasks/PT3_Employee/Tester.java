package day38_PracticeTasks.PT3_Employee;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int id, String jobTitle, String salaryName, String companyName) {
        super(name, age, gender, id, jobTitle, salaryName, companyName);
    }
    public void work(){
        System.out.println(getName()+" is working");
    }
}
