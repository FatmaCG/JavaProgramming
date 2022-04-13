package day23_PracticeTasks;

public class Tasks_14 {
    //14. create a method named printEachElement that can print each elements of an integer array
    public static void printEachElement(int[] numbers){
        for (int each:numbers) {
            System.out.println(each);
        }
    }

    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8};
        printEachElement(num);
    }
}
