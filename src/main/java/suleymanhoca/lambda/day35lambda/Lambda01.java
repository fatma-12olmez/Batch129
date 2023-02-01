package suleymanhoca.lambda.day35lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    /*
        1)Lambda "Functional programming" dir, digeri "Structured Programming"
        2)"Functional programming" "Ne yapmak gerekir?(What to do?)" ile ilgilenir "Nasil yapmak gerekir?(How to do?)" ile ilgilenmez.
        3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
        4)Lambda, Java'ya "Java 8"de eklendi.

        "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
        "filter()" filtrelemek icin kullanilir.
        "map()" u var olan elemani degistirmek icin kullanilir.
        "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
         Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
        "reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
         Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
         "u" ise degerlerini her zaman "stream" den alir.
         get()==> methodu "optional data type"ini "Integer"a cevirir.
    */
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElemants1(nums);
        System.out.println();
        printEvenelemants2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);
        System.out.println();

    }
    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
        //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
        //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    }

    public static void printElements2(List<Integer> nums) {  //12 9 131 14 9 10 4 12 15
        nums.stream().forEach(t -> System.out.print(t + " "));
    }
    //3)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void printEvenElemants1(List<Integer> nums) {

        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }

    }
    //3)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printEvenelemants2(List<Integer> nums) {

        nums.// //12 9 131 14 9 10 4 12 15
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
        {
        }
    }
    //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

          public static void printSquareOfOddElements(List<Integer> nums) {
        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t+" "));
          }
    //6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {
        nums.
                stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" "));
    }
    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){
        Integer sum = nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t, u)->t+u);
        System.out.println(sum);
    }


}