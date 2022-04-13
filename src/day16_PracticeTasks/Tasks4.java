package day16_PracticeTasks;

public class Tasks4 {
    public static void main(String[] args) {
        /*4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create */
        String str = "Java Java";
        int count = 0;
        for (int i = 0; i <= str.length() - 4; i++) {
            String str1 = str.substring(i, i + 4);
            if (str1.equalsIgnoreCase("Java")) {
                count++;
            }
        }
        System.out.println(count);

    }
}
