package day35_PracticeTasks;

public class Rectangle_Object {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(6,12);

        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        System.out.println(rectangle);
    }
}
