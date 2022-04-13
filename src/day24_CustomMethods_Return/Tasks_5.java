package day24_CustomMethods_Return;

import java.util.Arrays;

public class Tasks_5 {
    /*5. create a method that can merge two arrays and return the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}  */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};
        int[] merge=new int[arr1.length+arr2.length];
        merge=mergeTwoArrays(arr1,arr2);
        System.out.println(Arrays.toString(merge));
    }

    public static int[] mergeTwoArrays(int[] arr11,int[] arr22){
        int[] result=new int[arr11.length+arr22.length];
        int i=0;
        for (int each : arr11) {
            result[i++]=each;
        }
        for (int each : arr22) {
            result[i++]=each;
        }
        return result;
    }

}
