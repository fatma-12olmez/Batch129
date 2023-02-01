package grupcalismasi.calisma03;

import java.io.FilterOutputStream;

public class Soru01 {
    public static void main(String[] args) {


       /*
            EXAMPLE 1: Verilen yilin "Artik Yil (Leap Year) olup olmadigini kontrol eden kodu yaziniz.

                        1) Yil 100'e bolunurse 400'e bolunmelidir. ==> 1600 ==> Leap 1800 ==> Leap degil
                        2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. ==> 2004 ==> Leap   2005 ==> Leap degil
         */

        int year=2005;

      String result=year%100 ==0 ?(year%400==0 ?"leap Year":"Not leap") : (year%4==0 ? "Leap year":"Not Leap");

        System.out.println(result);

    }
}
