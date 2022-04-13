package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 40, 20, 1, 0};
        int max=numbers[0];

        for (int i = 0; i < numbers.length; i++) { //numbers.fori
            if (numbers[i]>max){  // if there is element in the array that's greater tahn the current  max number
                max=numbers[i];
            }
        }
        System.out.println(max);
    /*    for (int i = numbers.length - 1; i >= 0; i--) {
        }*/   // numbers.forr
    }
}
