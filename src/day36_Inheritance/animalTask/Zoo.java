package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setInfo("Max", "Husky", 'M', 2, "small", "White");

        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.move();
        dog1.bark();

        System.out.println(dog1);

        Cat cat1 = new Cat();
        cat1.setInfo("Tarcin", "British", 'M', 3, "Small", "Brown");

        cat1.eat();
        cat1.drink();
        cat1.sleep();
        cat1.meow();
        cat1.move();
        cat1.scratch();
        System.out.println(cat1);

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Black");

        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();
        tiger1.hunt();
        tiger1.sleep();
        tiger1.roar();

        System.out.println(tiger1);
    }

}
