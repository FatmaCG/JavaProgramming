package day21_PracticeTasks;

public class Tasks_3 {
    public static void main(String[] args) {
        /*3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

          MUST use for each loops */
        int[] arr1= {1,2,3,4,5};
        int[] arr2= {4,5,6,7,8};
        for (int each : arr1) {
            for (int i : arr2) {
                if (each==i){
                    System.out.print(each+" ");
                }
            }
        }
    }
}
