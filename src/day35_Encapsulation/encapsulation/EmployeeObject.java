package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Tahir",'M',28,110000);
        //System.out.println(employee1);
        employee1.setAge(39);
        System.out.println(employee1);

        Employee employee2=new Employee("Aygun",'F',23,120000);

        employee2.setName("Elvira");
        employee2.setSalary(employee2.getSalary()+15000);

        System.out.println(employee2);
    }
}
