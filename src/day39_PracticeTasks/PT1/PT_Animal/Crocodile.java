package day39_PracticeTasks.PT1.PT_Animal;

public class Crocodile extends WildAnimal{
    public Crocodile(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void hunt(){
        System.out.println("Crocodile "+getName()+" is hunting");
    }
}
