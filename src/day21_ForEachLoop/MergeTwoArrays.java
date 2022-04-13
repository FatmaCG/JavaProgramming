package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] grup1 = {"Ali", "Layan", "Aysenur"};
        String[] grup2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String[] students = new String[grup1.length + grup2.length];

        int i = 0;
        for (String each : grup1) {
            students[i++] = each;
            // i++;
        }
        for (String each : grup2) {
            students[i++] = each;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("--------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];
        int j = 0;
        for (char ch : ch1) {
            chars[j] = ch;
            j++;
        }
        for (char ch : ch2) {
            chars[j]=ch;
            j++;
        }
        System.out.println(Arrays.toString(chars));

    }

}
