package suleymanhoca.day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        // Example 1 ; String bir array olusturunuz , 6 tane eleman yerlestiriniz,character sayisi 5 den cok olan elemanlari siliniz

        String colors[]=new String[6];

         colors[0]="Red";
         colors[1]="Orange";
         colors[2]="Blue";
         colors[3]="Yellow";
         colors[4]= "Green";
         colors[5]="Brown";



        System.out.println(Arrays.toString(colors)); // [Red, Orange, Blue, Yellow, Green, Brown]

        //Logic: Yeni bir array olusturup character sayisi 5 ve 5'ten kucuk olan
        // elemanlari yeni array'a transfer edililecek boylelikle yeni array'da
        // character sayisi 5'ten buyuk olan hic bir eleman olmayacak.

        //Soru;Array olusturmak icin iki sey belirlenmelidir.
        // 1)Elemanlarin data type'i
        //2)Yeni array'da kac tane eleman olacak

        //verilen array'da eleman sayisi 5 ve 5'ten kucuk olan kac eleman var bulmaliyiz
        int counter=0;
        for (String w:colors) {
            if (w.length()<=5){
                counter++;

            }
        }
        //Yeni array olustur
        String newColors[]=new String[counter];
        int idx=0;

      //  Character sayisi 5 ve 5'ten kucuk olanlari yeni array'e transfer et
        for (String w:colors){

            if (w.length()<=5){
                newColors[idx]=w;
                idx++;

            }
        }
        System.out.println(Arrays.toString(newColors));





    }
}
