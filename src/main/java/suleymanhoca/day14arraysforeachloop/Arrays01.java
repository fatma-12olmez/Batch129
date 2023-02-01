package suleymanhoca.day14arraysforeachloop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
//           icerdigi karakter sayilari toplamini ekrana yazdiriniz.

         String arr[]=new String[5];

         arr[0]="Math";
         arr[1]="Science";
         arr[2]="Music";
         arr[3]="English";
         arr[4]="Art";
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length()+arr[ arr.length-1].length());//ilk elemanin caharcter sayisi +son elemanin character sayisi



        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        // icerdigi karakter sayilari toplamini ekrana yazdiriniz.

        String brr[]=new String[5];

        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Frankfurt";
        brr[3]="Dhaka";
        brr[4]="Athena";

        //1.yol for-loop

        //  NOTE: arrayler ile çalışırken başlangıç değeri 0 alınır
        int totalChar=0;

        for (int i=0;i<brr.length; i++){

            totalChar =  totalChar + brr[i].length();
        }
        System.out.println(totalChar);

        //2.Yol; for -each-loop(inhanced loop) ==>baslangic degeri ,loop'un calisma sarti,ve increment /decrement kismini kendisi halleder
        //      for -each-loop "Array"lerde ve "collection"larda kullanilir.
        //    Index kullanmaniz gerektiginde bazen "for each loop" caresiz kalir, mecburen diger loop'lari kullaniriz.



        int sum=0;
        for (String w : brr){
            sum=sum + w.length();

        }
        System.out.println(sum);


    }
}
