package day36_PracticeTasks.PT3;

public class AudioBook extends Book{
    public int length;
    public String narrator;

    public AudioBook(String title, String type, String author, double price,int length, String narrator) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
        this.length = length;
        this.narrator = narrator;
    }

    public void listen(){
        System.out.println("Listening to "+title);
    }


    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
