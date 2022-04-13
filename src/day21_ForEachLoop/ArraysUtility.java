package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("Min Scores: " + scores[0]);
        System.out.println("Max Scores: " + scores[scores.length - 1]);

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words = {"Anna", "ANNA"};

        Arrays.sort(words);  // Capital letter first after lower letters A > a  a~z(97)  A~Z (65)
        System.out.println(Arrays.toString(words));

        System.out.println("----------------------------");

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("----------------------------");//Anagram listen-- silent
                 //                                                  hearth -- earth
        char[] ch1={'a','c','b'};
        char[] ch2={'b','a','c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean r3=Arrays.equals(ch1,ch2);
        System.out.println("Anagram :"+r3);

    }
}
