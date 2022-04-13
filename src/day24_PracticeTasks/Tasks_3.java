package day24_PracticeTasks;

import java.util.Arrays;

public class Tasks_3 {
    public static void main(String[] args) {
        String word = "Java";
        word=reverse(word);
        System.out.println(word);
    }

    /*3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ  */
    public static String reverse(String word) {
        String rever="";
        for (int i=word.length()-1;i>=0;i--){
            rever+=word.charAt(i);
        }
        return rever;

    }
}
