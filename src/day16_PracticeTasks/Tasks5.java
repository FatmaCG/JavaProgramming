package day16_PracticeTasks;

public class Tasks5 {
    public static void main(String[] args) {
        /*5. write a program to print true if the string "cat" and "dog" appear the same number of times
        in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true   */
      String sentence = "caT dog dogG cAt";
        int cat=0;
        int dog=0;
        for (int i = 0; i <=sentence.length()-3; i++) {
            if (sentence.substring(i,i+3).equalsIgnoreCase("cat")){
                cat++;
            }else if (sentence.substring(i,i+3).equalsIgnoreCase("dog")){
                dog++;
            }
        }
        boolean result=cat==dog;
        System.out.println(result);

        System.out.println(sentence.startsWith("caT"));

       /* int x=75;
        System.out.println((char) x);
        String ch="Cydeo";
        System.out.println(ch.indexOf('o'));
        int y=5 , z=6;
        System.out.println(y+z+ch+x);*/
    }
}
