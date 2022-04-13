package day36_PracticeTasks.PT6;

import java.util.ArrayList;
import java.util.Arrays;

public class MyWallet {
    public static void main(String[] args) {
        Bitcoin bitcoin=new Bitcoin();
        bitcoin.setInfo(5000,23,45,12324,4655,true);

        Ethereum ethereum=new Ethereum();
        ethereum.setInfo(12342,464,45654,67,8,false);

        Cardano cardano=new Cardano();
        cardano.setInfo(756756,343,56,23,676,true);

        XRP xrp=new XRP();
        xrp.setInfo(5676,87,9879,2345,676,true);

        Doge doge=new Doge();
        doge.setInfo(679685,454,457687,90,23,false);

        ArrayList<CryptoToken> list=new ArrayList<>();
        list.addAll(Arrays.asList(bitcoin,ethereum,cardano,xrp,doge));
        
        double total=0;
        for (CryptoToken each : list) {
            total+=each.totalPrice();
        }

        System.out.println(total);
    }
}
