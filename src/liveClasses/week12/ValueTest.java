package liveClasses.week12;

public class ValueTest {
    public static void main(String[] args) {
        Value value=new Value();

        //print if I called set Value method
        System.out.println(value.calledMethod);

        //print the paramater without assign anything
        System.out.println(value.getValue()); // 0

        value.setValue(5);
        System.out.println(value.calledMethod); //true
        System.out.println(value.getValue());//5

        Value value1=new Value(3);
        System.out.println(value1.calledConstructor);//true
        System.out.println(value.calledMethod); // false
        System.out.println(value1.getValue()); //3
    }
}
