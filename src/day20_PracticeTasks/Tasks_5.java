package day20_PracticeTasks;

import java.util.Arrays;

public class Tasks_5 {
    public static void main(String[] args) {
        /*5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1}; */
        int[] array = {1,2,3,4,5};
        int[] reversedArray =new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reversedArray[j]=array[i];
        }
        System.out.println(Arrays.toString(reversedArray));
       /* System.out.print("Reversed Array ={");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i]+",");
        }
        System.out.println("}"); */
    }
}
