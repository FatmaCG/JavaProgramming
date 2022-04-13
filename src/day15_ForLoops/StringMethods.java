package day15_ForLoops;

public class StringMethods {
    public static void main(String[] args) {
        String str = "";
        boolean r = str.isEmpty();
        System.out.println(r);

        boolean r1=str.isBlank();
        System.out.println(r1);

        System.out.println("-------------------");

        String s1="CYDEO";
        String s2="cydeo";
        System.out.println(s1.equals(s2));  // false

        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println("yEs".equalsIgnoreCase("YES"));
        System.out.println("--------------------------------------");

        String sentence="My favourite programming language is Java";

        boolean hasCSharp=sentence.contains("C#");
        boolean hasJava=sentence.contains("Java");
        boolean hasJava2=sentence.contains("java");
        boolean hasjava3=sentence.toLowerCase().contains("java");
        boolean r3=sentence.contains("java") || sentence.contains("Java"); // jAvA bu sekil girerse
        // hata verecegi icin bunu kullanmak uygun olmaz

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasjava3);
        System.out.println(r3);

        System.out.println("-----------------------");
        String input1="I love jAvA";
        String input2="Java";

        System.out.println(input1.equals(input2));             //false
        System.out.println(input1.equalsIgnoreCase(input2));  // false

        System.out.println(input1.contains(input2));         //true
        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("----------------------------------");
        String a="Wooden Spoon";

        boolean x=a.startsWith("Woo");
        boolean y=a.endsWith("Spoon");
        boolean z=a.toLowerCase().startsWith("wooden"); // in order to ignore the case sensitivity
        //we first create the lower case/upper case version of string and  then compare it lower
        // case/upper case version

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

