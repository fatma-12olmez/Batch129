package grupcalismasi.calisma02;

import java.util.Scanner;

public class IfElse05 {

    public static void main(String[] args) {
        /*
    EXAMPLE 5 :

    Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini
   ilk harf buyuk diger ikisi kucuk olarak yazdiriniz,
    gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdiriniz
    gunlerin sadece ilk 3 harfi alincak onunda sadece ilk harfi buyuk olacak. ornegin Pazar i bu sekilde alacaksiniz "Paz"
     */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz...");

        String gunIsmi=input.next();
        if (gunIsmi.equalsIgnoreCase("pazar")) {
            System.out.println(gunIsmi.substring(0, 3).toUpperCase());
        }else if (gunIsmi.equals("pazartesi")){
                System.out.println(gunIsmi.substring(0, 3).toUpperCase());
        }else if (gunIsmi.equals("sali")){
            System.out.println(gunIsmi.substring(0,3).toUpperCase());
        }else if (gunIsmi.equals("carsamba")){
            System.out.println(gunIsmi.substring(0,3).toUpperCase());
        }else if (gunIsmi.equals("persembe")){
            System.out.println(gunIsmi.substring(0,3).toUpperCase());
        }else if (gunIsmi.equals("cuma")){
            System.out.println(gunIsmi.substring(0,3).toUpperCase());
        }else if (gunIsmi.equals("cumartesi")){
            System.out.println(gunIsmi.substring(0,3).toUpperCase());
        }else {
            System.out.println("gecersiz");

        }


    }
}
