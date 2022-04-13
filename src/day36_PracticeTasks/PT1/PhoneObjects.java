package day36_PracticeTasks.PT1;

public class PhoneObjects {
    public static void main(String[] args) {
        IPhone iPhone=new IPhone();
        iPhone.setInfo("IPhone 12","5.6 inches",1000,"Black");

        Samsung samsung=new Samsung();
        samsung.setInfo("Galaxy S19","6 inches",900,"White");

        Nokia nokia=new Nokia();
        nokia.setInfo("Brink","4 inches",60,"Pink");

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);

        iPhone.faceTime(783393878);
        iPhone.faceTime("fatmacekimguler@gmail.com");

        samsung.freeze();
        samsung.call(7833938);

        nokia.selfDefense();
        nokia.text(7833938);

    }

}
