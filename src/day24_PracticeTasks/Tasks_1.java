package day24_PracticeTasks;

public class Tasks_1 {
    /*1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3  */
    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word = "java";
      //  System.out.println(frequencyOfWord2(sentence,word));
        String[] sentenceArray=sentence.split(" ");
        int dd=frequencyOfWord(sentenceArray,word);
        System.out.println(dd);
    }

    public static int frequencyOfWord(String[] sentence, String word){
        int count=0;
        for (String each : sentence) {
            if (each.equalsIgnoreCase(word)){
                count++;
            }
        }
        return count;
    }
  /*  public static int frequencyOfWord2(String sentence, String word){
        int count = 0;
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    } */

}
