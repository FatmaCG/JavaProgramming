package day23_PracticeTasks;

public class Tasks_1_and_2 {
    public static void oddNumbers(){
        for (int i = 1; i <100; i+=2) {
            System.out.print(i+" ");
        }
    }

    public static void evenNumbers(){
        for (int i = 2; i <=100 ; i+=2) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        oddNumbers();
        System.out.println();
        evenNumbers();
    }
}
