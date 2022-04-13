package day33_PracticeTasks;

public class Dog {
    public String name,breed,size;
    public char gender;
    public int age;
    public String color;
    public static int numberOfLegs,numberOfEyes,numberOfWings;
    public static boolean isFriendly;
    static {
        numberOfLegs=4;
        numberOfEyes=2;
        numberOfWings=0;
        isFriendly=true;
    }

    public Dog(String name, String breed, String size, char gender, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }
    public void play(){
        System.out.println(name+" is playing");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
