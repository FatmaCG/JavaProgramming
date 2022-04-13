package day38_PracticeTasks.PT2_Animal;

public class Tiger extends Animal{
    public Tiger( String name,String breed, int age, char gender, String size, String color) {
        super("Tiger", breed, age, gender, size, color);
    }
    public void eat(){
        System.out.println("Eats dear");
    }
}
