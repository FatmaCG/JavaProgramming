package day39_Reacp.cydeoTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing the bugs");
    }
    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is developing the application");
    }

}
