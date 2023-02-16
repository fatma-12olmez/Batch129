package suleymanhoca.day31collections;

import java.util.HashSet;

public class HashSet01 {
    /*
    "Hash" bir tekniktir,Java   bu tekniği kullanarak  unique datalar üretir.
   "Set"  tekrarsız datadepolamak icin kullanilan bir Collection"dir.
   "Set" tekrar kabul etmez. Yani tekrarsız verileri depolamak için kullanılır.

   "Set"ler 3 'e ayrilir;
     i)HashSet: a)Super hizlidir.cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez
                    yani HashSet'lere eklenen elemanlar rastgele siralanirlar.
                b)HashSet'ler tekrar'li eleman'a musade etmezler.
                c)HashSet'ler sadece bir tane  "null"i eleman olarak kabul ederler.

   ii)LinkedHashSet:a)LinkedHashSet elemanlari "insertion order" a gore dizer.
                    b)LinkedHashSet elemanlari siralamakta zaman kaybettigi icin ,HashSet'e gore yavastir.

     iii)TreeSet : a)TreeSet elemanlari "naturel Order"(Kucukten buyuge veya alfabetik sira)a gore dizer.
                   b)TreeSet  "naturel order" yaparken cok zaman harcar o yuzden en yavas "Set"tir.
                   c)TreeSet'ler tekrar'li eleman'a musade etmezler.

                   non primitive olmalidir.....
     */

    public static void main(String[] args) {

        HashSet<Integer> hs= new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);
        System.out.println(hs);//[5, 234, 12, 78] ==>gordugunuz gibi elemanlar rastgele siralandi.

       int hc= hs.hashCode();
        System.out.println(hc);
    }
}


