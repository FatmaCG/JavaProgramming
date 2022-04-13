package liveClasses;

public class Week7_FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="aabcccd";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i); // 'a'
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (c==str.charAt(j)){
                    count++;
                }
            }
            // if I already have that particular char in the bucket , don't execute following codes
            if (result.contains(""+c)){
                continue;
            }
            result+=c;
            result+=count;
        }
        System.out.println("result = "+result);
    }

}
