package day35_PracticeTasks;

public class Item_Object {
    public static void main(String[] args) {
       Item item=new Item("tomatoes",1.2,3);
        System.out.println(item.getName());
        System.out.println(item.getUnitPrice());
        System.out.println(item.getQuantity());
        System.out.println(item.calcCost());
        System.out.println(item);
    }
}
