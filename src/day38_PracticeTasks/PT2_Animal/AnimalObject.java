package day38_PracticeTasks.PT2_Animal;

import day38_Inheritance.CarTask.Toyota;

public class AnimalObject {
    public static void main(String[] args) {
        Cat cat=new Cat("Pamuk","Siamese",3,'F',"Small","White");
        cat.eat();

        Dog dog1=new Dog("Alex", "Husky", 1, 'M', "small", "White");
        dog1.eat();

        Tiger tiger=new Tiger("Sher Khan", "Bengal", 4, 'M', "Large", "Black");
        tiger.eat();

        Eagle eagle=new Eagle("Kartal","Eag",5,'F',"medium","Black");
        eagle.eat();


    }
}
