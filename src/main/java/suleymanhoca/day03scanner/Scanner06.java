package suleymanhoca.day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz

        Scanner input= new Scanner(System.in);
        System.out.println("bes basamakli bir sayi giriniz");
        int number=input.nextInt();
        //son rakami al
        int lastDigit=number%10;
        number=number/10;

        //Sondan ikinci rakami al

        int lastSecondDigit=number%10;
        number=number/10;

        //Sondan ucuncu rakami al
       int LastThirdDigit=number%10;
       number=number/10;

        //Sondan dorduncu rakami al
        int lastFouthDigit=number%10;
        int lastFourthDigit = number%10;
        number = number/10;

        //Sondan besinci rakami al
        int lastFifthDigit = number%10;

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + lastFifthDigit);





    }
}
