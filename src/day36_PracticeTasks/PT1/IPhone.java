package day36_PracticeTasks.PT1;

public class IPhone extends Phone {
   public void faceTime(long phoneNumber){
       System.out.println(model+" is face timing with number "+phoneNumber);
   }
   public void faceTime(String email){
       System.out.println(model+" is face timing with email "+email);
   }
}
