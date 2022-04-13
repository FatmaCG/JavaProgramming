package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[] names={"Cydeo School","Wooden Spoon","Java Programming","SQL Programming","Selenium Automation","API Testing","Database Testing","Manual Testing"};
        for (String name : names) {
            String initial=name.charAt(0)+"."+name.charAt(name.indexOf(" ")+1);
            System.out.println(initial);
        }
    }
}
