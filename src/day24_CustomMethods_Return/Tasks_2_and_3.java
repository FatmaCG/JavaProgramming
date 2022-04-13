package day24_CustomMethods_Return;

public class Tasks_2_and_3 {
    public static void main(String[] args) {
        int[] numbers={1,2,5,3,87,67,45};
        int num= maximumNumberFromArray( numbers);

        int numnum=minNumberFromArray(numbers);
        System.out.println("Maximum number is = "+num);
        System.out.println("Minimum number is = "+numnum);

    }

    //2. create a method that can return the maximum number from an array of integers
    public static int maximumNumberFromArray(int[] number) {
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }

    //3. create a method that can return the minimum number from an array of integers
    public static int minNumberFromArray(int[] number){
        int min=number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i]<min){
                min=number[i];
            }
        }
        return min;
    }

}
