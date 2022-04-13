package day35_PracticeTasks;

public class Square {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side<0){
            return;
        }
        this.side = side;
    }

    public Square(int side) {
        setSide(side);
    }

    public int calcArea(){
        return (side*side);
    }

    public int calcPerimeter(){
        return (4*side);
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
