package yasinhoca.advanced_practice.practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_Manav {
    /*
	     Basit bir 5 ürünlü manav alışveris programı yazınız.
	 * 1. Adim : Ürün ve fiyat listesi oluştur.
	 * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
	 * 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
	 * 4. Adim : Alışveriş bitince ödemesi gereken tutarı göster.
	 * 5. Adim : Başka bir ürün almak isteyip istemediğini sor.
	 * 			 İstemiyorsa ödenecek tutarı göster, istiyorsa tekrar ürün seçtir.
	 * 			 Bu iþlemi alışveriş bitene kadar tekrarla.
	 */

    static List<String> urunListesi = new ArrayList<>();
    static double toplamOdeme;

    public static void main(String[] args) {
        urunListesi.add("Domates -  Urun Kodu 1 - Fiyati : 20");
        urunListesi.add("Biber  -     Urun Kodu 2- Fiyati : 25");
        urunListesi.add("Patate -  Urun Kodu 3 - Fiyati :9");
        urunListesi.add("Elma -  Urun Kodu 4 - Fiyati : 15");
        urunListesi.add("Muz -  Urun Kodu 5 - Fiyati : 30");
        System.out.println("urunListesi = " + urunListesi);

        musteriSecimi();

    }

    public static void musteriSecimi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Urun kodunu giriniz");
        int kod = scanner.nextInt();
        System.out.println("Kilo'yu giriniz");
        int kilo = scanner.nextInt();


        System.out.println(kilo+ " kilo "+urunListesi.get(kod-1).split(" ")[0]+ " ==> " +Integer.parseInt(urunListesi.get(kod-1).split(" ")[urunListesi.get(kod-1).split(" ").length-1]));
        toplamOdeme+=Integer.parseInt(urunListesi.get(kod-1).split(" ")[urunListesi.get(kod-1).split(" ").length-1])*kilo;
        System.out.println("toplam Odeme = " + toplamOdeme);

        System.out.println("aLisverise devam etmek icin D, kasa icin herhangi bir karakter giriniz");

        if (scanner.next().equalsIgnoreCase("d")){
            musteriSecimi();
        }else {
            System.out.println("toplam Odeme = " + toplamOdeme);
            System.out.println("Bizi tercih ettiginiz icin tesekkurler");
        }

    }


}
