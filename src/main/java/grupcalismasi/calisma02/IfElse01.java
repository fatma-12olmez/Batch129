package grupcalismasi.calisma02;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {
        /*
         EXAMPLE 1:

        Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin
        kare olup olmadigini yazdiriniz
     */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen iki kenar uzunlugu giriniz...");
        double kenar1=Math.abs(input.nextDouble());
        double kenar2=Math.abs(input.nextDouble());

        if(kenar1<=0 || kenar2<=0 ) {
            System.out.println("karenin kenarlari sifir veya negatif olamaz");
        }else if (kenar1==kenar2){
            System.out.println("bu bir karedir...");
        }else {
            System.out.println("bu bir kare degildir");
        }
    }

    }
