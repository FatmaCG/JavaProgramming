package day39_PracticeTasks.PT1.PT_Device;

public class Computer extends Device{
    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void bestComputer(){
        System.out.println(getBrand()+" is the best computer");
    }

}
