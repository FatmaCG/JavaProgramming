package liveClasses.week08;

import java.util.Arrays;

public class A01_ArrayExample {
    public static void main(String[] args) {
        int code = 200;
        int[] codes = new int[8];// my codes array holds 8 elements ,
        // they are all same data type
        //In Java ,Arrays are fixed size, not re-sizable Array hold same data type
        System.out.println(Arrays.toString(codes));// how we print an array
        /* Default values of Data Type
        int :0
        double:0.0
        String :null
         */ // Array starts 0 index
        codes[0] = 200;
        codes[1] = 201;
        System.out.println(Arrays.toString(codes));

        int[] statusCodes = {200, 201, 204, 400, 401, 403, 404, 500};//Another way of declaration and initializing
        System.out.println("--------------size of an array ------------");
        //String str="Java";str.length()----> size of the string

        //for arrays ,length gets no parameter and returs an integer
        System.out.println("The size of our array: " + statusCodes.length);

        int sizeOfArrays = statusCodes.length;// 8, use it for creating loops

        String[] responseTypes = new String[]{"OK", "Created", "No Content", "Bad Request",
                "Unauthorized", "Forbidden", "Not Found", "Internal Server Error"};
        for (int i = 0; i < sizeOfArrays; i++) {
            String text = statusCodes[i] + " : " + responseTypes[i];
            System.out.println("Each Status Code means= " + text);
        }
        //FOR EACH LOOPs:
        // it is used when you have collection
        // arraylist , map, list,set
       // We need two parts 1.temporary variable:needs to be same data type with  the Array
        //2.collection reference after ":" statement
        // for(int num:codes){statement}
       // Disadvantage:


    }
}
