package day35_Encapsulation.encapsulation;

public class CircleObject {
    public static void main(String[] args) {
        Circle circle1=new Circle(12);
        circle1.calcArea();
        circle1.calcPerimeter();
        System.out.println(circle1.getRadius());

    }


}
