package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 7,2,};

        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        double[] arr2={1.2,5.6,3.4,9.8,54.2,5.6,9.8,54.2};
        double[] uniqueD=uniqueElements(arr2);
        System.out.println(Arrays.toString(uniqueD));

        char[] arrCh2={'E','F','G','H','M','E','H'};
        char[] chUnique=uniqueElements(arrCh2);
        System.out.println(Arrays.toString(chUnique));

        String[] arrStr1={"Ali","Fatma","Meryem","Meltem","Ali","Fatma"};
        String[] strUnique=uniqueElements(arrStr1);
        System.out.println(Arrays.toString(strUnique));
    }
    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};//temporary  new int[0]
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is one,the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

}
