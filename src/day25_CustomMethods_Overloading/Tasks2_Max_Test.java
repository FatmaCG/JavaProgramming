package day25_CustomMethods_Overloading;

import Day25_PracticeTasks.Tasks2_Max;
import Day25_PracticeTasks.Tasks3_Min;
import Day25_PracticeTasks.Tasks4_Reverse;

import java.util.Arrays;

public class Tasks2_Max_Test {
    public static void main(String[] args) {
        int[] arr1={1,2,3,78,45,98};
        System.out.println("int max number ="+ Tasks2_Max.maxNumber(arr1));
        System.out.println("int min number ="+ Tasks3_Min.minNumber(arr1));
        System.out.println("Reverse "+ Arrays.toString(Tasks4_Reverse.reverseArray(arr1)));
        double[] arr2={1.2,5.6,3.4,9.8,54.2};
        System.out.println("Double max number = "+Tasks2_Max.maxNumber(arr2));
        System.out.println("Double min number = "+Tasks3_Min.minNumber(arr2));
        System.out.println("Reverse "+ Arrays.toString(Tasks4_Reverse.reverseArray(arr2)));
        float[] arr3={2.3f,4.8f,9.7f,66.5f};
        System.out.println("Float max number = "+Tasks2_Max.maxNumber(arr3));
        System.out.println("Float min number = "+Tasks3_Min.minNumber(arr3));
        long[]  arr4={34,78,12,76};
        System.out.println("Long max number = "+Tasks2_Max.maxNumber(arr4));
        System.out.println("Long min number = "+Tasks3_Min.minNumber(arr4));
    }
}
