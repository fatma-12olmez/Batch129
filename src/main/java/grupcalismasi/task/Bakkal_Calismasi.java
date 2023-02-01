package grupcalismasi.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bakkal_Calismasi {

    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan aşağıysa o günleri return yap.
     * */

    public static void main(String[] args) {
       // 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)

        List<String> gunler= new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        System.out.println(gunler);

         // 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        List<Double> gunlukKazanclar= new ArrayList<>();
         // 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        Scanner input=new Scanner(System.in);
        int i=0;
       while (i<gunler.size()){
           System.out.println(gunler.get(i)+" gunku kazancinizi giriniz");
           double kazanc=input.nextDouble();
           gunlukKazanclar.add(kazanc);
           i++;
       }
        System.out.println(gunlukKazanclar);

       double toplamKazanc=0;

       for (double w:gunlukKazanclar){
           toplamKazanc=toplamKazanc+w;

       }
        System.out.println("toplamKazanc = " + toplamKazanc);

        System.out.println("ortalama Kazanc: "+toplamKazanc/gunlukKazanclar.size());
    }


      //4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.




      public static void getOrtalamaKazanc(double a){




    }

}
