package day33_PracticeTasks;

public class IPhone_Test {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("iphone 12", 1000, "Black", "5.6 inches");

        System.out.println(iPhone);
        iPhone.faceTime(1833938783);
        iPhone.faceTime("fatmacekim@gmail.com");
        iPhone.call(1783393878);
        iPhone.text(17833938);
    }
}

