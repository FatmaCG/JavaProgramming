package day28_PracticeTasks;

import java.util.ArrayList;

public class Tasks_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.set(list.size() - 1, 0);
        System.out.println(list);
        // System.out.println(topla(2));
      //  int x = topla(2, 3);
      //  System.out.println(x);
    }

   /* public static int topla(int a, int b) {
        return topla(3, 4);
    } */

}
/*1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];  */
