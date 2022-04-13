package day21_PracticeTasks;

import java.util.Arrays;

public class Tasks_2 {
    public static void main(String[] args) {
        /*2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop  */
        int[] array = {5, 1, 28, 45, 34, 56, 25};
        int oddCount = 0, evenCount = 0;

        for (int each : array) {
            if (each % 2 == 0) {
                evenCount++;
            }else{
                oddCount++;
            }
        }
       // System.out.println(Arrays.toString(array) +" has "+evenCount+" even numbers and "+oddCount+" odd numbers");
        System.out.println("Number of even number is "+evenCount);
        System.out.println("Number of odd number is "+oddCount);
    }
}
