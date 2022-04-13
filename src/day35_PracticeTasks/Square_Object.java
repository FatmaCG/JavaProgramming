package day35_PracticeTasks;

public class Square_Object {
    public static void main(String[] args) {
        Square square=new Square(6);
        System.out.println(square.calcArea());
        System.out.println( square.calcPerimeter());

        System.out.println(square.getSide());
    }
}
