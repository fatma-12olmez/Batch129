package suleymanhoca.day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Bir String'in bas ve sonunda space character'i varsa siliniz.
        //             "   ALi  Can    "  ==>   "Ali Can"

        String s = "   Ali Can  ";
        System.out.println(s);

        //trim() method'u bir String'in bas ve sonundaki space characterleri siler,aradaki spacelere dokunmaz.
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv="$456,99";    String laptop="$875,99"  ==>456.99+ 875.99=1332,98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2);//"456.99";//Ondalik sayilar Java da otomatik olarak double kabul edilir.

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);//875.99

        Double toplamFiyat = Double.valueOf(tv2) + Double.valueOf(laptop2);

        System.out.println(toplamFiyat);//1332.98


        //Example 3; Verilen ismin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //   "Ali Can"==>AC

        String name = "  ali cAN   ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);

        System.out.println("" + first + second);

        //Example 4: Bir String'in hic character icermedigini (Bos String) kontrol eden kodu yaziniz

        String str = "";

        //1.Yol:length() kullan

        boolean result1 = str.length() == 0;
        System.out.println("string bos mu? " + result1);//True

        //2.Yol: isEmpty();Java bir konuda method uretmisse , o method'u kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("string bos mu? " + result2);//true

        //Example 4: Bir String'in space  haric hicbir character icermedigini kontrol eden kodu yaziniz
        String t = "        ";

        //1.yol
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println("Sadec space mi var? " + result3);

        //2.Yol

        Boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("Sadec space mi var? " + result4);

        //3.yol

        //isBlank() method'u  sadece space iceren String'ler icin true verir,space disinda cir character icerirse false verir
        //isBlank() method'u  bos String'ler icin de true verir.
        //isBlank() ===> space+hicbir sey icin true      isEmpty==>hicbir sey icin true
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var? " + result5);

        //Example 6:Bir String'de  a,i,e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //    "Java  is easy to learn" ==>1+5+8=14

        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');//1
        System.out.println(idxA);
        int idxI = r.indexOf('i');//5
        System.out.println(idxI);
        int idxE = r.indexOf('e');//8
        System.out.println(idxE);

        System.out.println("Index'ler toplami: " + (idxA + idxI + idxE));

        //Example 6:Bir String'de "java" kelime'sinin ilk kacinci  index'lerde kullanildigi  gosteren kodu yaziniz.
        //           "Ah Java vah Java sensiz olmuyor Java"==>3;
        String u = "Ah Java vah Java sensiz olmuyor Java.";

        //indexOf("Java");kullanildiginda siz "Java" kelimesinin ilk gorunusundeki ilk harfin (yani J'nin )index'ini almis olursunuz
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);

        //indexOf() method'u olmayan character'ler icin kullanilirsa her zaman -1 verir.
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);//-1

        //Example 8: Bir String'de  a,i,e characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //        //    "Java is easy to learn" ==>18+5+17+=40;


        String v = "Java is easy to learn";
        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);//18

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        System.out.println("Son index'leri toplami; " + (idxOfA + idxOfI + idxOfE)); //40

        //lastIndexOf() String'de olmayan bir character icin kullanilirsa her zaman -1 dir

        // Example 9:Bir String'deki tekrarsiz character'leri ekrana yazdiriniz.
        //           abbcccd==>ad

        String y = "abc";

        char ch1 = y.charAt(0);

        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }
        char ch2 = y.charAt(1);
        if (y.indexOf(ch2) == y.lastIndexOf(ch2)) {
            System.out.println(ch2);
            char ch3 = y.charAt(2);
            if (y.indexOf(ch3) == y.lastIndexOf(ch3)) {
                System.out.println(ch3);
            }

        }
        //Note: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //      Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
        //     if  you study hard, you will learn Java;


        //Example 10: Sayi pozitif ise ekrana pozitif yazdirin
        int num = 12;

        if (num > 0) {
            System.out.println("pozitif");
        }

        //Example 11: Sayi -1 ile 10 arasinda  ise ekrana rakam yazdirin
        int number = 3;
        if (number > 0 && number < 10) {
            System.out.println("Rakam");

        }

        //Example 12: Sayi 3 basamakli ise ekrana "waooow!" yazdirin

        int n = 123;

        n = Math.abs(n);

        if (n > 99 && n < 1000) {
            System.out.println("waowww!");
        }

    }
}
