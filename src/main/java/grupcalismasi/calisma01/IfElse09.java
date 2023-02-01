package grupcalismasi.calisma01;

import java.util.Scanner;

public class IfElse09 {
    public static void main(String[] args) {
         /*
        EXAMPLE 9:

        Kullanicidan bir gun alin
        - Eger gun cuma ise "Muslumanlar icin kutsal gun"
        - Eger gun cumartesi ise "Yahudiler icin kutsal gun"
        - Eger gun pazar ise "Hristiyanlar icin kutsal gun"
        Yazdiran kodu yaziniz
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz...");
        String gun=input.next();

        if (gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }else if(gun.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }else{
            System.out.println("gecerli bir gun giriniz...");
        }

    }
}
