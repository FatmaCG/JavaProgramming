package liveClasses.week11;

import java.util.ArrayList;

public class TestTV {
    public static void main(String[] args) {

        TV Samsung=new TV();
        System.out.println(Samsung);

        Samsung.turnOn();
        Samsung.setChannel(7);
        Samsung.setVolume(3);
        System.out.println(Samsung);


        TV LG=new TV();
        System.out.println(LG);
        LG.turnOn();
        LG.setChannel(11);
        LG.setVolume(5);
        System.out.println(LG);
        LG.channelDown();
        System.out.println(LG);

        TV Sony=new TV(3,5,false);

        ArrayList<TV> tvList=new ArrayList<>();
        tvList.add(Samsung);
        tvList.add(LG);
        tvList.add(Sony);

        for (TV eachTV : tvList) {
            System.out.println("Is the TV on ?" +eachTV.on);
        }

    }
}
