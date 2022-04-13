package day15_PracticeTasks;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 2; i <101 ; i+=2) {
            sum+=i;
        }
        System.out.println("Sum of even number 1 to 100 is "+sum);
    }
}
