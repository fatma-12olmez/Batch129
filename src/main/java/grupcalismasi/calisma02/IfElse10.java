package grupcalismasi.calisma02;

import java.util.Scanner;

public class IfElse10 {

    public static void main(String[] args) {

    /*
    EXAMPLE 19 :

    Kullanicidan 4 basamakli bir sayi girmesini isteyin. Girdigi sayi 5'e bolunuyorsa son rakamini kontrol
    edin. Girdigi sayi 5'e bolunuyorsa son eakamini kontrol edin. Son Rakami 0 ise ekrana "5'e bolunen
    cift sayi" yazdirin . son rakami 0 degil ise "5'e bolunen tek sayi" yazdirin.
    Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin.
     */

        Scanner input=new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz...");
        int number=input.nextInt();

        if (number%5==0){
            System.out.println(number/100);

        }
        System.out.println(number);
    }
}
