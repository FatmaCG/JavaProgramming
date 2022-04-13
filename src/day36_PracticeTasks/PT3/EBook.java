package day36_PracticeTasks.PT3;

public class EBook extends Book{
    public String size;
    public int pages;

    public void setInfo(String title, String type, String author, double price,String size, int pages) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("Reading "+title);
    }

    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
