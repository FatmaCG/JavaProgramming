package day19_LoopPractices;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = scan.nextLine();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 0;  // represents the frequency og the ch
            for (int j = 0; j < word.length(); j++) { //compares the character that outer loop picked each character
                char each = word.charAt(j);  // each character of str
                if (ch == each) {
                    count++;
                }
            }
          /*  if(count !=1){
                continue;
            }
            result+=ch;*/
            if (count == 1) { //if the frequency of the character is 1, then the character is unique
                result += ch;
            }
        }
        System.out.println(result);
    }

}
