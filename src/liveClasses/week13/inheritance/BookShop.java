package liveClasses.week13.inheritance;

public class BookShop {
    public static void main(String[] args) {
        Book bookOne=new Book();
        bookOne.title="Intro to Java";
        bookOne.author="Savitch";
        bookOne.type="programming";
        bookOne.price=85.90;

        System.out.println("bookOne = " + bookOne);

        AudioBook audioBook=new AudioBook("Selenium Cookbook","Automation","Unmesh",44.90,60,"Irina");


        audioBook.listen();
        //can I call parent class method with child class object
        audioBook.buy();
    }
}
