package day18_NestedLoop;

public class Star {
    public static void main(String[] args) {
        String star="";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                star+="* ";
                System.out.println(star);
                break;
            }
        }
    }
}
