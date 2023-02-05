package suleymanhoca.day33maps;

import java.util.*;

public class MapOrnek {
    public static void main(String[] args) {


        //  Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır. Ürün adlarını alfabetik sırayla yazdırınız.
        Map<String, Integer> product = new HashMap<>();
        product.put("Aspirateur",20);
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        Set<String> urunler = product.keySet();
        List<String> urunAlfabetikSira=new ArrayList<>(urunler);
        Collections.sort(urunAlfabetikSira);
        System.out.println(urunAlfabetikSira);

    //Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır. Ürünler arasında ” Laptop ” olup olmadığını kontrol etmek için kodu yazınız.

    Map<String, Integer> product2 = new HashMap<>();
       product2.put("Laptop", 12);
        product2.put("TV", 53);
        product2.put("Refrigerator", 12);
        product2.put("Music System", 87);



        if (product2.containsKey("Laptop")){
        System.out.println("var");
    }else {
        System.out.println("yok");
    }

//Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.
                      Map<String, Integer> product3 = new HashMap<>();
         product3.put("Laptop", 12);
        product3.put("TV", 53);
        product3.put("Refrigerator", 12);
        product3.put("Music System", 87);
         Collection<Integer> urunsayisi=product3.values();
         Integer toplam=0;

         for (Integer w:urunsayisi){
             toplam+=w;
         }
        System.out.println("toplam Urun Sayisi: "+toplam+"'tur");

    //     Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
         myList.add(21);
         myList.add(12);
         myList.add(13);
         myList.add(12);
         myList.add(21);
         myList.add(35);
         Map<Integer, Integer> myMap = new HashMap<>();

         for (Integer w: myList){
             Integer urunsayisi2=myMap.get(w);

             if (urunsayisi2==null){
                 myMap.put(w,1);
             }else {
                 myMap.put(w,urunsayisi2+1);

                 }
             }
             Collection<Integer> myValues=myMap.values();
             Integer counter=0;
             for (Integer w :myValues){
                 if (w>1){
                     counter++;
                 }

             }
             System.out.println("tekralanan urun sayisi " +counter);
         }




   }
