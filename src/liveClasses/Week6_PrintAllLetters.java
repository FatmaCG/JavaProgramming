package liveClasses;

public class Week6_PrintAllLetters {
    public static void main(String[] args) {
        for (char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }
        //chars are also iterable   yenilenebilir
        System.out.println();
        for (int i = 65; i <=90 ; i++) {
            System.out.print((char)i+" ");
        }
    }
}
