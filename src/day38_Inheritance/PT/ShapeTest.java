package day38_Inheritance.PT;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle=new Circle(12);

        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle);

        System.out.println();
        Square square=new Square(5);
        System.out.println(square);

        System.out.println();
        Rectangle rectangle=new Rectangle(5,8);
        System.out.println(rectangle);
    }
}
