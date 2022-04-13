package day31_PracticeTasks;

public class MovieObjects {
    public static void main(String[] args) {
        String genre="Adventure,Comedy,Thriller";
        String title="Journey to SDET: Cydeo Batch 25";
        String[] casts={"Asiya","Adam","Muhtar","Akbar","Gurhan","Songul","Bahar","Filiz"};

        Movie movie1=new Movie("USA",title,genre,"10/25/2021","Kuzzat Altay");
        movie1.addCasts(casts);
        System.out.println(movie1);
    }
}
