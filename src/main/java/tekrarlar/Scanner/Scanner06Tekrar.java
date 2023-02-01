package tekrarlar.Scanner;

import java.util.Scanner;

public class Scanner06Tekrar {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("alti basamakli sayi giriniz");

        int number=input.nextInt();

        int firstDigit=number%10;
        number=number/10;

        int secondDigit=number%10;
        number=number/10;

        int thirdDigit=number%10;
        number=number/10;

        int fourthDigit=number%10;
        number=number/10;

        int fifthDigit=number%10;
        number=number/10;

        int sixthDigit=number%10;
        number=number/10;

        System.out.println((firstDigit+secondDigit)+(fifthDigit+sixthDigit));



    }
}
