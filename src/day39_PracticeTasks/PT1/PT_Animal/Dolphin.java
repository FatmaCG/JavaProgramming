package day39_PracticeTasks.PT1.PT_Animal;

public class Dolphin extends FriendlyAnimal{
    public Dolphin(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void eat(){
        System.out.println("Dolphin "+getName()+" is eating");
    }
    public void swim(){
        System.out.println(getName()+" is swimming");
    }
}
