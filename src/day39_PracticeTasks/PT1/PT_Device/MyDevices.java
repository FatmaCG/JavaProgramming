package day39_PracticeTasks.PT1.PT_Device;

public class MyDevices {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone", "Iphone 12", 1000, true, true, 783393878);
        phone.setPhoneNum(783393);
        System.out.println(phone);

        System.out.println();
        Computer computer=new Computer("Macbook","Macbook Air",1199,true,false);
        computer.bestComputer();

        Laptop laptop=new Laptop("MAC","Macbook Air ",1000,false,false);

        System.out.println(laptop);


    }
}
