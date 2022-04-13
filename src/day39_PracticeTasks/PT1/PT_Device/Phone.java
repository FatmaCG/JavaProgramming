package day39_PracticeTasks.PT1.PT_Device;

public class Phone extends Device{
   private long phoneNum;

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton, long phoneNum) {
        super(brand, model, price, hasBattery, hasPowerButton);
        setPhoneNum(phoneNum);
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void call(long phoneNum){
        System.out.println(phoneNum +" is calling");
    }

    public void text(long phoneNum){
        System.out.println(phoneNum+" is texting");
    }

    public String toString() {
        return "Phone{" +
                "phoneNum=" + phoneNum +
                '}';
    }
}
