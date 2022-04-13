package day38_PracticeTasks.PT3_Employee;

public class EmployeeObjects {
    public static void main(String[] args) {
        Tester tester=new Tester("Chinara",32,'F',123,"1415","125000","IBM");
        tester.work();

        Developer developer=new Developer("Emine",37,'F',202,"Java Developer","200000","Amazon");
        developer.work();

    }
}
