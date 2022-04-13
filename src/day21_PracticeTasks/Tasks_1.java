package day21_PracticeTasks;

import java.util.Arrays;

public class Tasks_1 {
    public static void main(String[] args) {
        //1. Write a program that sort the array of integer in descending order
        int[] array={5,1,28,45,34,56,25};
        int[] rearray=new int[array.length];
        Arrays.sort(array);
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            rearray[j]=array[i];
        }
        System.out.println(Arrays.toString(rearray));

    }
}
