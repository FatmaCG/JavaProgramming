package day35_Encapsulation.encapsulation;

public class Circle {
    private double radius;
    public static double pi;
    static {
        pi=3.14;
    }

    public Circle(double radius) {
        setRadius(radius);
       // this.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }

    public void calcArea(){
        System.out.println(pi*radius*radius);
    }
    public void calcPerimeter(){
        System.out.println(2*pi*radius);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
