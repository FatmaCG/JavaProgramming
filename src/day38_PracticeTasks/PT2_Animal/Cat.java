package day38_PracticeTasks.PT2_Animal;

public class Cat extends Animal{
    public Cat( String name,String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }
    public void eat(){
        System.out.println("Eats "+getName()+" food");
    }
}
