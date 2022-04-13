package liveClasses;

public class DivisionAndRemainderPractice {
    public static void main(String[] args) {
        int inputSeconds=5000;
        int hours,minutes,seconds;
        /*
        1 minute is 60 seconds ,1 hour 3600 seconds
        */
        seconds=inputSeconds%60 ;//calculate remaining seconds
        minutes=(inputSeconds/60)%60;//remaining minutes
        hours= inputSeconds/3600;//how many hours we have

        String clock="Hours : "+hours+" Minutes : "+minutes+" Seconds : "+seconds;
        System.out.println("Clock : "+clock);
    }
}
