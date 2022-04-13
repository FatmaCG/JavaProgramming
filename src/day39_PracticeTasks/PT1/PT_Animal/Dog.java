package day39_PracticeTasks.PT1.PT_Animal;

public class Dog extends FriendlyAnimal{
    public Dog(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void eat(){
        System.out.println("Dog "+getName()+" is eating meat");
    }
    public void bark(){
        System.out.println(getName()+" is barking");
    }
}
