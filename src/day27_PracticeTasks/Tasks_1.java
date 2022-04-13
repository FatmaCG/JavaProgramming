package day27_PracticeTasks;

import java.util.Arrays;

public class Tasks_1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(insert(arr, 1, 80)));

        double[] arr2={1.2,3.4,5.6,7.8,9.1,2.3};
        System.out.println(Arrays.toString(insert(arr2,3,6.7)));

        char[] arr3={'A','B','C','D','E','G','H'};
        System.out.println(Arrays.toString(insert(arr3, 5, 'F')));

        String[] arr4={"Fatma","Ali","Meryem","Meltem"};
        System.out.println(Arrays.toString(insert(arr4, 2, "Guler")));

    }
    public static int[] insert(int[] array,int index,int element){
        if (index<0 || index>= array.length){
            System.err.println("Invalid Index "+index);
            System.exit(0);
        }
       int[] result=new int[array.length+1];
       int i=0;
        for (int each : array) {
            if (i==index){
                result[i++]=element;
                result[i++]=each;
            }else{
                result[i++]=each;
            }
        }
        return result;
    }

    public static double[] insert(double[] array,int index,double element){
        double[] result=new double[array.length+1];
        int i=0;
        for (double each : array) {
            if (i==index){
                result[i++]=element;
               result[i++]=each;
            }else{
                result[i++]=each;
            }
        }
        return result;
    }

    public static char[] insert(char[] array,int index,char element){
        char[] result=new char[array.length+1];
        int i=0;
        for (char each : array) {
            if (i==index){
                result[i++]=element;
                result[i++]=each;
            }else{
                result[i++]=each;
            }
        }
        return result;
    }

    public static String[] insert(String[] array,int index,String element){
        String[] result=new String[array.length+1];
        int i=0;
        for (String each : array) {
            if (i==index){
                result[i++]=element;
                result[i++]=each;
            }else{
                result[i++]=each;
            }
        }
        return result;
    }
}
/*1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array*/
