package day33_PracticeTasks;

public class Person_Test {
    public static void main(String[] args) {
        Person person1=new Person("Fatma",39,'F');
        Person person2=new Person("Ali",42,'M');

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);

        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);

        person1.eat(" Banana");
        person2.drink(" Tea");
        person1.sleep();
    }

}
