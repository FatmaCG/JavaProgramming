package week01;

public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator object1=new StringManipulator("Java");
        System.out.println(object1.str);

        StringManipulator object2=new StringManipulator("Selenium");
        System.out.println(object2.str);

        object1.firstTwoChars();//called the method ->I want my method do the ACTION
        System.out.println(object1.str);
        System.out.println(object2.str);
        System.out.println(object1.x);//you need to call the attribute or method so they get into effect

        String str="oscar";
        StringManipulator object3=new StringManipulator(str);
        System.out.println(object3.str);

        object3.str="Fatma";
        System.out.println(object3.str);

        //call the tripler method with our second object

        String password=object2.tripler();
        System.out.println(password);
    }
}
