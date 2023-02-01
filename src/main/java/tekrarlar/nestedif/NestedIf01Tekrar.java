package tekrarlar.nestedif;

import java.util.Scanner;

public class NestedIf01Tekrar {
    public static void main(String[] args) {
         /*
          Example 1: Kullanicidan 3 tane sayi aliniz.
                     Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                     Eger ucgen ise “eskenar”
                     Ucgen olma durumunu
                     kontrol ediniz.
                     INFO :
                     Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                       herhangi iki kenar farki ucuncu kenardan kucuk olmali
                     a+b>c>a-b
                     a+c>b>a-c
                     b+c>a>b-c
                     a=b=c ise eskenar ucgen
         */
        Scanner input = new Scanner(System.in);
        System.out.println("1.kenar uzunlugunu giriniz");
        int a = input.nextInt();
        System.out.println("2. kenar uzunlugunu giriniz");
        int b = input.nextInt();
        System.out.println("3. kenar uzunlugunu giriniz");
        int c = input.nextInt();


        if (a + b > c && a - b > c) {

            if (a + c > b && a - c > b) {
            }
            if (b + c > a && b - c > a) {
            }
            if (a == b && b == c) {

            }
            System.out.println("Eskenar ucgen");
        }
    }
}
