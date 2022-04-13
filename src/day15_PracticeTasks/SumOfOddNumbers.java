package day15_PracticeTasks;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <100 ; i+=2) {
            sum+=i;
        }
        System.out.println("Sum of odd number 1 to 100 is "+sum);
    }
}
