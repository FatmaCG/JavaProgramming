package day39_PracticeTasks.PT1.PT_Animal;

public class Parrot extends FriendlyAnimal{
    public Parrot(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void eat(){
        System.out.println("Parrot "+getName()+" is eating");
    }
    public void fly(){
        System.out.println(getName()+" is flying");
    }
    public void sing(){
        System.out.println(getName()+" is singing");
    }
}
