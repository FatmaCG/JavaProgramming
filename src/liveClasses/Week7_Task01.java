package liveClasses;

public class Week7_Task01 {
    public static void main(String[] args) {
        /*Print below pattern using loop

        1                           1
        2 6                         2 -"4" - 6                                       :row1
        3 7 10                      3 -"4" - 7 - "3" - 10                            :row1 - row2
        4 8 11 13                   4 -"4" - 8 - "3" - 11 - "2" - 13                :row1 - row2 - row3
        5 9 12 14 15                5 -"4" - 9 - "3" - 12 - "2" - 14 - "1" - 15     :row1 - row2 - row3 -row4

         */
        int rowCount=5;
        for (int row = 1; row <=rowCount; row++) {
            int value=row;
            for (int col=1; col <=row ; col++) {
               // System.out.print(i +" "+ j +" ");
                System.out.print(value+" ");
                value+=rowCount-col; // adding 4 for col=1 , adding 3 col=2
            }
            System.out.println();
        }
        /*for(int i=1;i<=5;i++) {

            int a = 0, b = 4;

            for (int j = 1; j <= i; j++) {

                int s = i + a;

                System.out.print(s + " ");

                a+= b;
                b--;

            }
            System.out.println();
        }*/
    }
}
