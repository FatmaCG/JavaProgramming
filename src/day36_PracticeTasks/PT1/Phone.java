package day36_PracticeTasks.PT1;

public class Phone {
    public String brand,model,size;
    public double price;
    public String color;

    public void setInfo( String model, String size, double price, String color) {
        brand=getClass().getSimpleName();
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public void call(long phoneNumber){
        System.out.println(brand + "  " +model + " is calling "+ phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand + "  " +model + " is texting "+ phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
