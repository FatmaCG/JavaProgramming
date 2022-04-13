package day19_LoopPractices;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

       /* Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str=scan.nextLine();

        String result=""; //a2b1c3d1

        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j); // 'each character from string
            int count=0;

            for (int i = 0; i < str.length(); i++) { // to find the frequency of each character
                char each=str.charAt(i); // each character of str
                if(ch==each){
                    count++;
                }
            }
            if ((result.contains(""+ch))){
                continue;
            }
            result+=ch;
            result+=count;
        }
        System.out.println(result);  */
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below
        for(int i=0;i<words.length;i++) {
            System.out.println("" + words[i].charAt(0) + words[i].charAt(words.length - 1));
        }

}
}
