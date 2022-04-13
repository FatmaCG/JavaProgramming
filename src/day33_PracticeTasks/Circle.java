package day33_PracticeTasks;

public class Circle {
    public double radius,diameter;
    public static double pi;
    static {
        pi=3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter=2*radius;
    }
    public double calcArea(){
        return pi*radius*radius;
    }
    public double calcPerimeter(){
        return pi*diameter;
    }
  /*  public void printPi(){
        System.out.println("Pi: "+pi);
    }*/

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", Pi =" + pi +
                ", area =" + calcArea() +
                ", perimeter =" + calcPerimeter() +
                '}';
    }
}
