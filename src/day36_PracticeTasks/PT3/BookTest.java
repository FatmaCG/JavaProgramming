package day36_PracticeTasks.PT3;

public class BookTest {
    public static void main(String[] args) {
        EBook eBook=new EBook();
        eBook.setInfo("Sefiller","World Classics","Victor Hugo",25,"large",543);

        AudioBook audioBook=new AudioBook("Calikusu","Turkish Classic","Reset Nuri Guntekin",20,6,"Assfd");

        System.out.println(eBook);
        eBook.readBook();

        System.out.println(audioBook);
        audioBook.listen();
    }


}
