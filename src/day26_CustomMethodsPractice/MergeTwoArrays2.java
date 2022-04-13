package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int[] arr3=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        String[] a1={"ali","fatma"};
        String[] a2={"meryem","meltem"};

        String[] result=merge(a1,a2);
        System.out.println(Arrays.toString(result));
    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1,int[] arr2){
        int[] result={}; //temporary -- gecici

        for (int each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }
    //merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1,double[] arr2){
        double[] result={}; //temporary -- gecici

        for (double each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1,char[] arr2){
        char[] result={}; //temporary -- gecici

        for (char each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1,String[] arr2){
        String[] result={}; //temporary -- gecici

        for (String each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }
}
