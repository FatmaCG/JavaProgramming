package day27_PracticeTasks;

public class Tasks_3 {
    public static void main(String[] args) {
        String str = "Wooden Spoon!123£$";
        char[] ch=str.toCharArray();
        String letters="";
        String digit="";
        String specialChars="";
        for (char each : ch) {
            if (Character.isLetter(each)){
                letters+=each;
            }else if(Character.isDigit(each)){
                digit+=each;
            }else{
                specialChars+=each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("Digits = " + digit);
        System.out.println("specialChars = " + specialChars);

    }

}
/*3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";  */
