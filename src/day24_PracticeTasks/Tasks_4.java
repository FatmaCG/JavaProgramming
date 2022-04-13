package day24_PracticeTasks;

public class Tasks_4 {
    /*4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter,
     the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true  */
    public static void main(String[] args) {
        String str="Level";
      // String strReverse=reverse(str);

      //  System.out.println(str +" and "+strReverse+ " is Palindrome "+(isPalindrome(str,strReverse)));
        System.out.println(isPalindromem(str));
    }

   /* public static String reverse(String word){
        String result="";
        for (int i = word.length()-1; i >= 0; i--) {
            result+=word.charAt(i);
        }
        return result;
    }*/
   /* public static boolean isPalindrome(String word,String strReverse){
        boolean result2=word.equalsIgnoreCase(strReverse);
        return result2;
    }*/
    public static boolean isPalindromem(String str){
        return Tasks_3.reverse(str).equalsIgnoreCase(str);
    }
}
