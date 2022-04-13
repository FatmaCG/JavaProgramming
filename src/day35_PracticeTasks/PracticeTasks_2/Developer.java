package day35_PracticeTasks.PracticeTasks_2;

public class Developer {
    private String name;
    private char gender;
    private String jobTitle;
    private int id;
    private double salary;

    public static boolean isEmployed;
    static {
        isEmployed=true;
    }

    public Developer(String name, char gender, String jobTitle, int id, double salary) {
        setName(name);
        setGender(gender);
        setJobTitle(jobTitle);
        setId(id);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public static boolean isIsEmployed() {
        return isEmployed;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(0);
        }
        this.name = name;
    }

    public void setGender(char gender) {
        if (!(gender=='M'||gender=='F')){
            System.err.println("Invalid Gender");
            System.exit(0);
        }
        this.gender = gender;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setId(int id) {
        if (id<=0){
            System.err.println("Invalid id");
            System.exit(0);
        }
        this.id = id;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.err.println("Invalid salary: "+salary);
            System.exit(0);
        }
        this.salary = salary;
    }
    public static void setIsEmployed(boolean isEmployed) {
        Developer.isEmployed = isEmployed;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
