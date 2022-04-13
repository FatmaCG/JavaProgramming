package day35_PracticeTasks;

public class Carpet_Object {
    public static void main(String[] args) {
        Carpet carpet=new Carpet(5,10,2,true);
        System.out.println(carpet.calcCost());

        System.out.println(carpet.getWidth());
        System.out.println(carpet.getLength());
        System.out.println(carpet.getUnitPrice());
        System.out.println(carpet.isPersian());

        System.out.println(carpet);
    }
}
