package liveClasses.week11;

import java.util.ArrayList;
import java.util.Arrays;

public class SomeUsefulMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
       // list.remove(1);
        System.out.println(list);

       // list.removeIf(p -> p==1);
        list.remove(Integer.valueOf(1));
        System.out.println(list);

        //array to array list
        String[] array={"red","green","blue"};
        ArrayList<String> listTwo=new ArrayList<>(Arrays.asList(array));
        System.out.println(listTwo);

        //array list int an array

        String[] arrayTwo=new String[listTwo.size()];//size is fixed to 3
        listTwo.toArray(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));

        //how to make an int array to an Integer ArrayList

        int[] arrayThree={1,2,3,4};
        ArrayList<Integer> listThree=new ArrayList<>();
       // listThree.addAll(Arrays.asList(arrayThree));
        /*java: incompatible types: inference variable T has incompatible bounds
          lower bounds: java.lang.Integer,java.lang.Object
           lower bounds: int[]*/
        for (Integer each : arrayThree) { //autoboxing
            listThree.add(each);
        }
        System.out.println(listThree);

    }
}
