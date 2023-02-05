package suleymanhoca.day36lambda;

import suleymanhoca.day35lambda.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);

        List<Double> half = getHalfOfElementsGraterThanFiveDistinctReversed(myList);
        System.out.println(half);//[19.2, 13.4, 6.0, 3.5]

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");
        printAllAlphabeticallyUpperDistinct(list);
        System.out.println();
        printAllAlfabeticallyLowerDistinct(list);
        System.out.println();
        printAllSortWithLengthUpperDistinct(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct1(list);
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);
        System.out.println();
        // System.out.println(removeElementfTheLengthGreaterThanFive(list));
        // System.out.println();
      //  System.out.println(removeElementIfStartsWithAOrEndsWithd(list));
      //  System.out.println();
        System.out.println(printLengthSquare(list));
        System.out.println();
        System.out.println(printElementsLengthEven(list));
        System.out.println();
        printAllSortWithLastCharUpperDistinct2(list);



    }
    //1) Create a method to find the half of the elements greater than 5, distinct, in reverse order, in a list.

    public static List<Double> getHalfOfElementsGraterThanFiveDistinctReversed(List<Double> myList) {
        return myList.stream().distinct().filter(t -> t > 5).map(t -> t / 2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }

    //2)Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz.

    public static void printAllAlphabeticallyUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted().forEach(t -> System.out.print(t + " "));
    }

    //3)Tum list elemanlarini kucuk harfle alfabetik siranin tersinde, tekrarsiz olarak yazdiriniz.;

    public static void printAllAlfabeticallyLowerDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }

    //4)Tum list elemanlarini buyuk harfle,uzunluklarina artan sirada,tekrarsiz olarak yazdiriniz.
    public static void printAllSortWithLengthUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.length())).forEach(t -> System.out.print(t + " "));

    }
    //5)Tum list elemanlarini buyuk harfle,son harflerine gore artan sirada tekrarsiz olarak yazdiriniz.

    public static void printAllSortWithLastCharUpperDistinct1(List<String> list) {

        list.
                stream().
                distinct().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                //(t->t.charAt(t.length()-1 Lambda expression olarak adlandirilir.
                map(t -> t.toUpperCase()).
                forEach(t -> System.out.print(t + " "));
    }
    public static void printAllSortWithLastCharUpperDistinct2(List<String> list) {

        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utils::getLastChar).reversed()).forEach(Utils::printInTheSameLineWithASpace);
    }

    //6)Tum list elemanlarini buyuk harfle,uzunluklarina artan sirada,tekrarsiz olarak yazdiriniz.
    //Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String> list) {
        list.
                stream().
                distinct().
                map(String::toUpperCase).//String::toUpperCase yapisina "method reference" denir.
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);

    }

    // 7)Character sayisi 5'ten fazla olan elemanlari siliniz.ve sonucu list olarak yazdiriniz
//
//    public static List<String> removeElementfTheLengthGreaterThanFive(List<String> list) {
//        list.removeIf(t -> t.length() > 5);
//        return list;
//    }
//

//    // 8)"A" ile baslayan veya "d" ile biten  elemanlari siliniz.
//    public static List<String> removeElementIfStartsWithAOrEndsWithd(List<String> list) {
//        list.removeIf(t -> t.startsWith("A") || t.endsWith("d"));
//        //Bazen "stream()" method'u bize lazim olan method'lara ulasmamiza engel olur bu yuzden //  stream() method'unu kullanmayiz."removeIf" Methodunda oldugu gibi
//        // Fakat "stream()" methodunu daha sonradan kullanmamız gerekibilir. Bu durumda "stream()" methodunu kullanarak istediğimiz methodlara
//        //ulasiriz, distinct() methoduna ulaştığımız gibi.
//        // sonuc bize list olarak lazım ise  "collect(Collectors.toList()" ile sonucu List'e ceviririz
//        return list.stream().distinct().collect(Collectors.toList());
//    }

    //9)List elemanlarini character sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz
    public static List<Integer> printLengthSquare(List<String> list){
       return list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());
    }

    //Example 10: List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz
      public static List<String> printElementsLengthEven(List<String>list){

          return list.stream().filter(Utils::isEven).collect(Collectors.toList());
      }












}