package day39_PracticeTasks.PT1.PT_Animal;

public class Zoo {
    public static void main(String[] args) {
        FriendlyAnimal friendlyAnimal=new FriendlyAnimal("Pamuk","English Cat",'F',1,"small","White",false,true,true);
        friendlyAnimal.play();

        WildAnimal wildAnimal=new WildAnimal("Aslan","bbb",'M',5,"Big","Brown",true,false,false);
        wildAnimal.hunt();

        Cat cat=new Cat("Princes","bb",'F',2,"small","White",false,true,true);
        cat.eat();

        Lion lion=new Lion("Hpp","fsd",'F',7,"large","Black",true,false,false);
        lion.hunt();

    }
}
