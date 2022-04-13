package day38_Inheritance.PT;

public class Circle extends Shape{
    private double r;
    public static double pi=3.14 ;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if(r<=0){
            System.err.println("Invalid radius "+r);
            System.exit(1);
        }
        this.r = r;
    }

    public Circle(double r) {
        super("Circle");
        setR(r);
    }

    public double area() {
        return pi*r*r;
    }

    public double perimeter(){
        return 2*pi*r;
    }

    public String toString() {
        return "Circle{" +
                "radius='" + r +'\'' +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter()+ '\'' +
                '}';
    }
}
