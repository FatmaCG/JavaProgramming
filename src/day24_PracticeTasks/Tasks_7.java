package day24_PracticeTasks;

import java.util.Arrays;

public class Tasks_7 {
    /*7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}  */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3}, arr2 = {4,5,6} ;
        System.out.println(Arrays.toString(mergeArray(arr1,arr2)));

    }
    public static int[] mergeArray(int[] arr11,int[] arr22){
        int[] result=new int[arr11.length+arr22.length];
        int i=0;
        for (int each : arr11) {
            result[i++]+=each;
        }
        for (int each2 : arr22) {
            result[i++]+=each2;
        }
        return result;
    }
}
