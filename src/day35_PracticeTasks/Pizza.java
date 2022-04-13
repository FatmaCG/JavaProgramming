package day35_PracticeTasks;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping,numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setSize(String size) {
        if(! (size.equals("small") || size.equals("medium") || size.equals("large") )){
            return;
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping<0){
            return;
        }
        if (size.equals("small")){
            if (numberOfCheeseTopping >3){
                return;
            }
        }else if (size.equals("medium")){
            if (numberOfCheeseTopping >4){
                return;
            }
        }else if (size.equals("large")){
            if (numberOfCheeseTopping >5){
                return;
            }
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping<0){
            return;
        }
        if (size.equals("small")){
            if (numberOfPepperoniTopping >4){
                return;
            }
        }else if (size.equals("medium")){
            if (numberOfPepperoniTopping >5){
                return;
            }
        }else if (size.equals("large")){
            if (numberOfPepperoniTopping >6){
                return;
            }
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public int calcCost(){
        return (size.equals("small"))? 10+((numberOfCheeseTopping+numberOfPepperoniTopping)*2) :(size.equals("medium"))? 12+((numberOfCheeseTopping+numberOfPepperoniTopping)*2) : 14+((numberOfCheeseTopping+numberOfPepperoniTopping)*2) ;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", pizza cost=" + calcCost() +
                '}';
    }
}
