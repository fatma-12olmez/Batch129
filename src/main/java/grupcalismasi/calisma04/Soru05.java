package grupcalismasi.calisma04;

import java.util.Scanner;

public class Soru05 {
    public static void main(String[] args) {

        /*
120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
ardışık tam sayı arasında boşluk bırakarak yazınız.

 */
        int i=120;
        while(i>10){
            if (i%4==0 && i%6==0){
                System.out.print(i + " ");//120 108 96 84 72 60 48 36 24 12



            }
            i--;

        }

    }
}
