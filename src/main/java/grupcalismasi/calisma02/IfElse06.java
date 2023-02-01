package grupcalismasi.calisma02;

import java.util.Scanner;

public class IfElse06 {
    public static void main(String[] args) {


    /*
    EXAMPLE 6 :

    Kullanicidan iki sayi isteyin,
     sayilarin ikisi de positif ise sayilarin toplamını yazdirin,
    sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
    sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
     sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.
    */
        Scanner input=new Scanner(System.in);
        System.out.println("iki sayi giriniz...");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();


        if (sayi1==0 || sayi2==0) {
                System.out.println("sifir carpmaya gore yutan elemandir");
             }else if (sayi1 > 0 && sayi2 > 0) {
                System.out.println(sayi1 + sayi2);
            } else if (sayi1 < 0 && sayi2 < 0) {
                System.out.println(sayi1 * sayi2);
            } else {
                System.out.println("farkli isaretlerde sayilarla islem yapamazsin");

        }



    }
}
