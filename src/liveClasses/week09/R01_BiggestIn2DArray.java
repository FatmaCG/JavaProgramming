package liveClasses.week09;

import java.util.Arrays;

public class R01_BiggestIn2DArray {
    public static void main(String[] args) {
        //find the biggest number in each array and store it to another one dimensional array
        int [][] arr = { {3,12,3,34,12}, {13,7,456,34,3}, {-5, -24, -2, -10, -4} };

        //I want to print this @D array at the console
        System.out.println(Arrays.deepToString(arr));
        int[] biggestNumbers=new int[arr.length];
        //arr.length the size of 2D array
        for (int i = 0; i < arr.length; i++) {
            int max=arr[i][0];//this statemnt means first element of each array at index i
            //for each one single dimen array I need to have a seperate
            for (int each : arr[i]) {
                if (each>max){
                    max=each;
                }
            }
            biggestNumbers[i]=max;
        }
        System.out.println(Arrays.toString(biggestNumbers));

    }

}