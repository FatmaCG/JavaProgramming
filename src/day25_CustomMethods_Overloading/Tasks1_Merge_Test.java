package day25_CustomMethods_Overloading;

import Day25_PracticeTasks.Tasks1_Merge;
import Day25_PracticeTasks.Tasks4_Reverse;

import java.util.Arrays;

public class Tasks1_Merge_Test {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6,7};
        int[] result=Tasks1_Merge.merge(arr1,arr2);
        System.out.println(Arrays.toString(result));

        double[] arrD1={1.2,3.4,5.6};
        double[] arrD2={9.8,7.6,5.4};
        double[] result2=Tasks1_Merge.merge(arrD1,arrD2);
        System.out.println(Arrays.toString(result2));

        char[] arrCh1={'A','B','C','D'};
        char[] arrCh2={'E','F','G','H','M'};
        char[] result3=Tasks1_Merge.merge(arrCh1,arrCh2);
        System.out.println(Arrays.toString(result3));
        System.out.println(Tasks4_Reverse.reverseArray(arrCh2));

        String[] arrStr1={"Ali","Fatma","Meryem","Meltem"};
        String[] arrStr2={"Berra","Rana","Guler"};
        String[] result4=Tasks1_Merge.merge(arrStr1,arrStr2);
        System.out.println(Arrays.toString(result4));
        String[] result5=Tasks4_Reverse.reverseArray(arrStr1);
        System.out.println(Arrays.toString(result5));
    }
}
