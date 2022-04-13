package liveClasses;

public class SomeExtraTasks {
    public static void main(String[] args) {
        int b=2;
        boolean res= ++b==2 || --b==2 && --b==2;
                //false(b:3)|| 2==2(true),false
                //       true && false
                //          False
        System.out.println(res);
    }
}
