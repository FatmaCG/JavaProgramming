package day35_PracticeTasks.PracticeTasks_2;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        ArrayList<Candy> candiesList = new ArrayList<>();
        Candy candy1 = new Candy("Bubble Gum", 3, 50, true);
        Candy candy2 = new Candy("Candy Corn", 13, 20, false);
        Candy candy3 = new Candy("Candy Props", 10, 25, false);
        Candy candy4 = new Candy("Cotton Candy", 50, 5, false);
        Candy candy5 = new Candy("Kosher Candy", 200, 0, true);

        candiesList.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));
        for (Candy each : candiesList) {
            System.out.println(each.getBrand()+" : "+(each.getPrice()==0 ? "Free": "$"+each.getPrice()));
        }


    }
}
