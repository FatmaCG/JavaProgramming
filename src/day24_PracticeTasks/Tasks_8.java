package day24_PracticeTasks;

import java.util.Arrays;

public class Tasks_8 {
    /*8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}*/
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        arr=reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverseArray(int[] arra) {
        int[] reverse=new int[arra.length];
        int j=0;
        for (int i = arra.length-1; i >= 0; i--) {
            reverse[j++]=arra[i];
        }
        return reverse;
    }
}
