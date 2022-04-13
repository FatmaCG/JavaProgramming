package day20_Arrays;

import java.util.Arrays;

public class Tasks_2 {
    public static void main(String[] args) {
        //create an array that has the number 100 to 1
        int[] numbers=new int[100];
        int j=100;
        for (int i = 0; i < 100; i++) {
            numbers[i]=j--;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
