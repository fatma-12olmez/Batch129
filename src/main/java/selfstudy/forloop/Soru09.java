package selfstudy.forloop;

import java.util.Scanner;

public class Soru09 {
    //Kullanicidan iki sayi isteyin .Girilen sayilar ve aralarindaki tum sayilari toplayip sonucu yazdiran kodu yaziniz.

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayiyi giriniz");
        int num1 = input.nextInt();
        System.out.println("2.Sayiyi giriniz");
        int num2 = input.nextInt();
        int toplam = 0;
        for (int i = num1; i<=num2; i++) {

            toplam = toplam +i;

        }
        System.out.println(toplam);
    }














/*
        Scanner input=new Scanner(System.in);
        System.out.println("1.Sayiyi giriniz");
        int num1= input.nextInt();
        System.out.println("2.Sayiyi giriniz");
        int num2= input.nextInt();

        int toplam=0;

        for (int i=num1;i<=num2;i++){

            toplam=toplam+i;

        }

        System.out.println(toplam);
    }
 */

}
