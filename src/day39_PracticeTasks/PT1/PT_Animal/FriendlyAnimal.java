package day39_PracticeTasks.PT1.PT_Animal;

public class FriendlyAnimal extends Animal{
    private boolean isWild, isFriendly,isPlayable;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public void play(){
        System.out.println(getName()+" is play");
    }

    public void pet(){
        System.out.println(getName()+ " is pet");
    }

    public String toString() {
        return "FriendlyAnimal{" +
                "isWild='" + isWild + '\'' +
                ", isFriendly='" + isFriendly + '\'' +
                ", isPlayable='" + isPlayable + '\'' +
                '}';
    }
}
