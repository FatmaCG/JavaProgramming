package day39_PracticeTasks.PT1.PT_Device;

public class TV extends Device{
    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void channelUp(){
        System.out.println("Channel is upping");
    }
    public void channelDown(){
        System.out.println("Channel is downing");
    }
}
