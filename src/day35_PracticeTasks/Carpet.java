package day35_PracticeTasks;

import java.util.ArrayList;
import java.util.Date;

public class Carpet {
    /*public static void main(String[] args) {
        ArrayList dates=new ArrayList<>();
        dates.add(new Date());

        Date date=(Date) dates.get(0);
        System.out.println(date);
    }*/

    private int width,length;
    private double unitPrice;
    private boolean isPersian;

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setWidth(int width) {
        if(width<=0){
            return;
        }
        this.width = width;
    }

    public void setLength(int length) {
        if(length<=0){
            return;
        }
        this.length = length;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<=0){
            return;
        }
        this.unitPrice = unitPrice;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public Carpet(int width, int length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        this.isPersian = isPersian;
    }

    public double calcCost(){
        return (isPersian()==true)? (width*length)*unitPrice + 200 : (width*length)*unitPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total Cost=" + calcCost() +
                '}';
    }
}

