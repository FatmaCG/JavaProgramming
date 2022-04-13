package day39_PracticeTasks.PT1.PT_Animal;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void eat(){
        System.out.println("Cat "+getName()+" is eating");
    }
    public void scratch(){
        System.out.println(getName()+" is scratching");
    }
    public void meow(){
        System.out.println(getName()+" is meowing");
    }
}
