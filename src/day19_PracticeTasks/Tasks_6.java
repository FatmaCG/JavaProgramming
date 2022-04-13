package day19_PracticeTasks;

public class Tasks_6 {
    public static void main(String[] args) {
        /*6.  Write a program that can find the
        character that has the highest frequency from a string */
        String word = "aaabbccdeeffff";
        int maxCount=0;
        String result="";
        String ch1="";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (ch == word.charAt(j)) {
                    count++;
                }
            }
            if (count>maxCount){
                maxCount=count;
                ch1=ch+"";
            }
            if (result.contains(""+ch)){
                continue;
            }
            result+=ch;
        }
        System.out.println(maxCount);
        System.out.println(result);
        System.out.println(ch1);
    }
}
