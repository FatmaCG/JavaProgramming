package Day25_PracticeTasks;

public class Tasks3_Min {
    //1. create a method that can return the min number from an integer array
    public static int minNumber(int[] array){
        int min=array[0];
        for (int each : array) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }

    //2. create a method that can return the min number from double array
    public static double minNumber(double[] array){
        double min=array[0];
        for (double each : array) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }

    //3. create a method that can return the min number from long array
    public static long minNumber(long[] array){
        long min=array[0];
        for (long each : array) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }

    //4. create a method that can return the min number from short array
    public static short minNumber(short[] array){
        short min=array[0];
        for (short each : array) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }

    //5. create a method that can return the min number from float array
    public static float minNumber(float[] array){
        float min=array[0];
        for (float each : array) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }

    //6. create a method that can return the min number from byte array
    public static byte minNumber(byte[] array){
        byte min=array[0];
        for (byte each : array) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }
}

