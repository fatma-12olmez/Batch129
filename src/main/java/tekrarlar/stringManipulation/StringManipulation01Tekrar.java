package tekrarlar.stringManipulation;

import java.util.Locale;

public class StringManipulation01Tekrar {
    public static void main(String[] args) {

        String s="Hayat Guzeldir...!";

        //Example 1: "s" String'indeki tum character'leri buyuk harf yapiniz
       String buyuk= s.toUpperCase();
        System.out.println(buyuk);

        //Example 2: "s" String'indeki tum character'leri kucuk harf yapiniz
        String kucuk=s.toLowerCase();
        System.out.println(kucuk);

        //Example 3:"s" String'indeki ilk character'i aliniz

        char ilkChar=s.charAt(0);
        System.out.println(ilkChar);

        //Example 4:"s" String'indeki ikinci ve sondan ikinci  character'i aliniz ve ekrana yan yana yazdiriniz.
        char ilkikinci=s.charAt(1);
        char sonIkinci=s.charAt(12);
        System.out.println(""+ilkikinci+sonIkinci);

        //Example 5:"s" String'inde kullanilan character sayisini bulunuz.

        int toplamHarf=s.length();
        System.out.println(toplamHarf);

        //Example 6:"s" String'indeki ilk dort   character'i aliniz.
        String ilkDortChar=s.substring(0,4);
        System.out.println(ilkDortChar);

        //Example 7:"s" String'indeki "gu" kelimesini aliniz.

        String sub1=s.substring(6,8);
        System.out.println(sub1);

        //Example 8:"s" String'indeki "guzel" kelimesini aliniz.

        String sub2=s.substring(6,11);
        System.out.println(sub2);

        //Example 9:"s" String'inde "money" kelimesinin var olup olmadigini kontrol ediniz.
        Boolean isExist=s.contains("money");
        System.out.println(isExist);

        //Example 10:"s"String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart=s.startsWith("Hayat");
        System.out.println(isStart);

        //Example 11:"s"String'inin  6. character'den itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.

        boolean isBegin=s.startsWith("G ",7);
        System.out.println(isBegin);

















    }
}
