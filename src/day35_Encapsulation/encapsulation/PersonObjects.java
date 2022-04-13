package day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1=new Person();

        person1.setName("Fatma");
        person1.setAge(39);

        System.out.println(person1.getName()+" : "+person1.getAge());
       // System.out.println(person1.getAge());
    }

}
