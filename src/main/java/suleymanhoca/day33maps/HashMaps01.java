package suleymanhoca.day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {
    /*
    1)Map'ler  "USA=400.000.000"seklinde data depolamamiz gerektiginde kullanilir.
    2)"USA=400.000.000" data'sinin "USA" kismi "key" olarak adlandirilir ve "key"ler "unique"dir
    3)"USA=400.000.000" data'sinin "400.000.000" kismi "value" olarak adlandirilirve "value"ler tekrarli olabilir.
    4)Map'lerde depoladiginiz her bir data'ya "Entry" denir, "Eleman" denmez.
    5)"Entry"ler "unique"dir cunku key kisimlari "unique" oldugundan herbir entry digerlerinden farklidir.
    6)"HashMap"cok hizlidir cunku "HashMap"ler "Entry"leri siralamak ile ugrasmazlar.
    7)"HashMap"lerde bir tane key'i "null" yapabilirsiniz.
    8)"HashMap"lerde birden fazla "value" u "null" yapabilirsiniz.
    9)"HashMap"ler "multi-thread" icin kullanilmaz ve"synchronization" yoktur.
    10)"HashMap"lerde siralama random dir
     */

    public static void main(String[] args) {

        //HashMap nasil olusturulur.
        HashMap<String, Integer> hm = new HashMap();//"HashMap"lerin data tipi iki tane olur primitive kullanilmaz.
        System.out.println(hm);//{}

        //HashMap'lere nasil entry eklenir.
        hm.put("USA", 400000000);
        hm.put("Germany", 85000000);
        hm.put("Albania", 3000000);

        //Ayni key'i kullanarak yeni bir entry eklerseniz var olan value'u update etmis olursunuz .
        hm.put("Albania", 28000000);//En sonki ozelligi verir
        hm.put(null, 12000000);
        hm.put(null, 18000000);
        hm.put("Myanmar", null);
        hm.put("Bhutan", null);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=null, Germany=85000000, Albania=28000000}

        //HashMap'lerde sadece "key"leri almak istiyorum.
        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys);//[null, Myanmar, USA, Bhutan, Germany, Albania]


        //HashMap'lerde sadece "value"lari almak istiyorum.
        //Example 1: hm map'inde ki ulkelerin toplam nufusunu bulunuz

        Collection<Integer> hmValues = hm.values();

        int sum = 0;
        for (Integer w : hmValues) {
            if (w != null) {
                sum = sum + w;
            }
        }
        System.out.println(sum);

        //HashMap'lerde belirli bir "key"nin  "value" sunu nasil alabiliriz
        Integer UsaPopulation = hm.get("USA");
        System.out.println(UsaPopulation);//400000000

        //HashMap'lerde replace() method'u varolan bir "key"nin value"sunu degistirmek icin kullanilir.
        hm.replace("Bhutan", 35000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=28000000}

        //Hashmap lerde putIfAbsent() methodu  entry varsa birsey yapmaz, yoksa yeni entry olusturur.
        hm.putIfAbsent("USA", 700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=28000000}


        hm.putIfAbsent("India", 700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=28000000, India=700000000}


        //Example 2;Yeni ogretmenin maasi standart ucretten 1000TL fazla ,eski ogretmenin maasi standart ucretten 2000TL fazla olsun

        HashMap<String, Integer> salaries = new HashMap<>();

        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Tom";

        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);
        } else {
            salaries.putIfAbsent(teacherName, 11000);
        }
        System.out.println(salaries);


        //replace("USA",400000000,500000000) method'u key USA ve value 400000000 ise value'u 500000000 yapar
        hm.replace("USA", 400000000, 500000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=85000000, Albania=28000000, India=700000000}

        //m.getOrDefault()olan key'lerin degerini verir olmayan key'ler icinde sizin ikinci parametre'ye yazdiginiz degeri verir.
        Integer r = hm.getOrDefault("Bhutan", 0);
        System.out.println(r);


        //entrySet(); methodu "Map"i "Set"e cevirir.
        // Setlerin methodlarini kullanabilmek icin entrySet(); method'unu kullanarak Map'i Set'e cevirebiliriz.
        //Map'i Set'e cevirdigimizde Set'in butun ozelliklerini kullanabiliriz.Mesela loop gibi
        // EntrySet(); method'u kullandiginizda  elde ettiginiz Set'in elemanlari  "Map.Entry<String ,Integer>" seklinde bir Map olur.
        //elemanlar için Map methodları kullanılabilir
        Set<Map.Entry<String, Integer>> myEntries = hm.entrySet();
        System.out.println(myEntries);//[null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=85000000, Albania=28000000, India=700000000]


        //Example 3: Ulke ismindeki character sayisini ulke nufusuna ekleyen ve sonucu console'a yazdiran code'u yaziniz.
        for (Map.Entry<String, Integer> w : myEntries) {
            if (w.getValue() != null && (w.getKey() != null)) {

                int toplam = w.getValue() + w.getKey().length();
                System.out.println(toplam);
            }
        }
    }

}
