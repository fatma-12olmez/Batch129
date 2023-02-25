package Recap.recapders2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {


        Apartman da01 = new Apartman("dogu", 1, 7000);
        Apartman da02 = new Apartman("bati", 2, 10000);
        Apartman da03 = new Apartman("guney", 3, 120000);
        Apartman da04 = new Apartman("dogu", 5, 150000);

        List<Apartman> daireler = new ArrayList<>(Arrays.asList(da01, da02, da03, da04));

        System.out.println(tumDaireKira5000denBuyukIseTrue(daireler));
        System.out.println(" \n  *******");

    }
    // SORU1: Tüm dairelerin kira'ları 5000'den buyuk ise return ederek True yazdırın

    public static boolean tumDaireKira5000denBuyukIseTrue(List<Apartman> daireler) {
        Boolean sonuc = daireler.stream().allMatch(t -> t.getKira() > 5000);
        return sonuc;

        // SORU2: Dairelerden En Az Birinin katSayisi 2 ise return ederek True yazdırın
    }

    public static boolean EnAzBirininKatSayisi2IseTrue(List<Apartman> daireler) {
        Boolean sonuc = daireler.stream().anyMatch(t -> t.getKatSayi() == 2);
        return sonuc;
    }
    


}


