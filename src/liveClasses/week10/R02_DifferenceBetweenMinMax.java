package liveClasses.week10;

public class R02_DifferenceBetweenMinMax {
    public static void main(String[] args) {
        int[] array={19,28,37,45,5,69,7,8,9,10,11};
        System.out.println(difference(array));
        System.out.println(R01_CountOfEven.counter(array));
    }
    public static int difference(int[] arr){
        int diff=0;
        int min=Integer.MAX_VALUE;//int min=arr[0];
        int max=Integer.MIN_VALUE;//int max=arr[0];
        for (int each : arr) {
            if (each<min){
                min=each;
            }
            if (each>max){
                max=each;
            }
        }
        diff=max-min;
        return diff;
    }
}
