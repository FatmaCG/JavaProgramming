package day36_PracticeTasks.PT2;

public class EmployeeObjects {
    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.setInfo("Ali",'M',42,1234,"Senior Tester",60000);

        Developer developer=new Developer();
        developer.setInfo("Fatma",'F',39,2345,"Senior Developer",100000);

        Teacher teacher=new Teacher();
        teacher.setInfo("Gulcin",'F',35,5432,"Prof Teacher",50000);

        Driver driver=new Driver();
        driver.setInfo("Ahmet",'M',45,3214,"Driver prof",45000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        developer.coding();
        tester.testing();
    }

}
