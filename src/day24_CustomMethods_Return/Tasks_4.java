package day24_CustomMethods_Return;

import java.util.Arrays;

public class Tasks_4 {
    /*4. create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}   */
    public static void main(String[] args) {
        int[] reverse={1,2,3,4,5,6};
        int[] reve=reverseArray(reverse);
        System.out.println(Arrays.toString(reve));
    }
    public static int[] reverseArray(int[] number){
        int[] result=new int[number.length];
        int j=0;
        for (int i = number.length-1; i >= 0; i--) {
            result[j++]=number[i];
        }
        return result;
    }

}
