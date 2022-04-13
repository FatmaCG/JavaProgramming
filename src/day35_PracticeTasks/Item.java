package day35_PracticeTasks;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        boolean isLetter = true;
        for (char each : name.toCharArray()) {
            if (!Character.isLetterOrDigit(each)) {
                isLetter = false;
            }
        }
        if (name.isBlank() || name.isEmpty() || !Character.isLetter(name.charAt(0)) || isLetter) {
            return;
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            return;
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            return;
        }
        if (name.equals("toiletpaper")) {
            if (quantity >1){
                return;
            }
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }


    public double calcCost(){
        return (quantity*unitPrice);
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }
}
