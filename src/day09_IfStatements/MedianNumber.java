package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a=100,
                b=200,
                c=300;
        if((a<b&&b<c)||(c<b&&b<a))  //  ( b > c && b < a ) || ( b > a && b < c )
        {
            System.out.println(b+ " is the median number");
        }
        else if ((b<a && a<c)||(c<a&&a<b))  //  ( a>b && a<c ) || ( a>c ) && ( a<b )
        {
            System.out.println(a+ " is the median number");
        }
        else //if ((a<c&&c<b)||(b<c&&c<a))
        {
            System.out.println(c+ " is the median number");
        }
    }
}
