package day27_WrapperClasses;



public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num + 1); //124
        System.out.println(str + 1); //1231

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);//double

        System.out.println(num2 + 1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1 = "maybe";
        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println("r1 = " + r1);

        System.out.println("---------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2);//Integer
        int y = Integer.valueOf(s2);

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);  //Double

        System.out.println(z);

        System.out.println("---------------------------------------------");

        //isDigit()
        char ch1 = '0';

        boolean r2 = Character.isDigit(ch1);
        System.out.println(ch1 + " is digit : " + r2);

        //isLetter();
        char ch2 = 'A';
        boolean r3 = Character.isLetter(ch2);
        System.out.println(ch2 + " is letter : " + r3);

        //isLetterOrDigit()
        char ch3 = '!';
        boolean r4 = !(Character.isLetterOrDigit(ch3));
        System.out.println(ch3 + " is special character : " + r4);

        //isUpperCase()
        boolean r5 = Character.isUpperCase(ch2);
        System.out.println(ch2 + " is UpperCase : " + r5);

        //isLoverCase()
        boolean r6 = Character.isLowerCase(ch2);
        System.out.println(ch2 + " is LowerCase : " + r6);

        System.out.println("---------------------------------------------");

        String s = "ab1cde2efg3hi4";
        int sum = 0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println("sum = " + sum);

    }
}
