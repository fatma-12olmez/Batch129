package suleymanhoca.day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {

        //Example 1:    Integer bir listolusturunuz
        //              List'e 5 tane eleman ekleyiniz
        //              Bu elemanlardan 12'yi siliniz


        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        //Note:Siz java'da tamsayi yazdiginizda ,Java  o tamsayinin data type'ini otomatik olarak "primitive  int" kabul eder.
        //Bu yuzden remove() method'unun icine yazdigi tamsayi eleman olarak degil  index olarak kabul edilir.
        //Tamsayi'yi eleman olarak gostermenin bir kac yolu vardir.


        //1.yol:
        // Integer nonPrimitive=12;
        // ages.remove(nonPrimitive);

        //2.yol  Recommended
        // ages.remove((Integer) 12);

        //3.yol:
        // ages.remove(Integer.valueOf(12));  //2 method kullanildi

        //4.Yol
        // ages.remove(ages.indexOf(12));  //2 method kullanildi
        System.out.println(ages);

        //Example 2:      Integer bir listolusturunuz
        //                   List'e 5 tane eleman ekleyiniz
        //                   Tum  12'leri siliniz

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);
        silinecekler.add(25);

        //removeAll() Method'u List ile calisir
        //removeAll() Method'u bir veya birden fazla elemanin tum gorunumlerini silmek icin kullanilir.
        nums.removeAll(silinecekler);


        System.out.println(nums);


    }
}
