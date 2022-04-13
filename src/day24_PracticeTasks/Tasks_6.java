package day24_PracticeTasks;

import java.util.Arrays;

public class Tasks_6 {
    /* 6. create a method named addElement that takes one integer array and one integer, the method can add
    the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4} */
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int num = 4;
        int[] res=new int[arr.length+1];
        res=addElement(arr, num);
        System.out.println(Arrays.toString(res));
    }
    public static int[] addElement(int[] arr,int num){
        int[] result=new int[arr.length+1];
        int j=0;
        for (int each : arr) {
            result[j++]=each;
        }
        result[j]=num;
        return result;
    }

}
