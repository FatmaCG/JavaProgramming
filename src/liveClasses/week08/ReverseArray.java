package liveClasses.week08;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
                    //0   1  2    3
        int[] nums = {5, 10, 4, 1000,35};

        System.out.println("Before reverse : "+ Arrays.toString(nums));

        for (int i = 0; i < nums.length/2; i++) {
            int temp=nums[i]; //5
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
        System.out.println("After reverse : "+Arrays.toString(nums));

        //Arrays utulity class created by Java developers and it has some useful methods that
        // we can use

        Arrays.sort(nums);
        System.out.println("Arrays.toString(nums : "+Arrays.toString(nums));
    }
}
