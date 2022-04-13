package day27_PracticeTasks;

import java.util.Arrays;

public class Tasks_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(swap(arr, 2, 4)));
    }

    public static int[] swap(int[] array, int i, int j) {
        if (i < 0 || j < 0 || i >= array.length || j >= array.length){
            System.err.println("Invalid Index  ");
            System.exit(0);
        }
           /* for (int k = 0; k < array.length; k++) {
                if (k == i) {
                    int x = array[k];
                    array[k] = array[j];
                    array[j] = x;

                }
                array[k] = array[k];
            } */
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        return array;
    }

}
/*Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
	 the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array  */