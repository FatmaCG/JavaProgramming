package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        IPhone iPhone1=new IPhone("Iphone 12","6.7 inches",1000,"Rose Gold");

        Samsung samsung1=new Samsung("Galaxy S19","6 inches",900,"White");

        Nokia nokia1=new Nokia("Brick","4 inches",50,"Gray");

        System.out.println(iPhone1);
        System.out.println(samsung1);
        System.out.println(nokia1);

        iPhone1.call(911);
        iPhone1.text(123456);
        iPhone1.faceTime(78339387);
        iPhone1.faceTime("fatmacekim@gmail.com");

        System.out.println("------------------------------------------------");

        samsung1.call(911);
        samsung1.text(78339387);
        samsung1.freeze();

        System.out.println("------------------------------------------------");

        nokia1.call(911);
        nokia1.text(78339387);
        nokia1.selfDefense();

        System.out.println("------------------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(IPhone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);

    }

}
