package day35_PracticeTasks.PracticeTasks_2;

public class Credentials_Test {
    public static void main(String[] args) {
        Credentials credentials=new Credentials("fatma","fatma12GC!");

        System.out.println(credentials);
        System.out.println(credentials.isStrongPassWord());
        System.out.println(credentials.getPassword());
        System.out.println(credentials.getUsername());

        credentials.setUsername("meryem");
        System.out.println(credentials);

    }



}
