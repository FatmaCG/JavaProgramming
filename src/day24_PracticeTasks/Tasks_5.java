package day24_PracticeTasks;

public class Tasks_5 {
    /*5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5  */
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2,2};
        int num=2;
        System.out.println(frequencyOfNumber(array,num));

    }
    public static int frequencyOfNumber(int[] arrays,int num1){
        int count=0;
        for (int each : arrays) {
            if (each==num1){
                count++;
            }
        }
        return count;

    }
}
