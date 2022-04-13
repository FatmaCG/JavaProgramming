package day38_PracticeTasks.PT2_Animal;

public class Dog extends Animal{
    public Dog( String name,String breed, int age, char gender, String size, String color) {
        super("Dog", breed, age, gender, size, color);
    }
    public void eat(){
        System.out.println("Eats "+getName()+" food");
    }
}
