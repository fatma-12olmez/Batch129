package tekrarlar.ifstatement;

import java.util.Scanner;

public class IfStatement02Tekrar {
    public static void main(String[] args) {
        //Example 2: Kullanicadan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num=input.nextInt();
         if (num%2==0){
             System.out.println("Cift sayi...");
         }else if (num%2!=0){
             System.out.println("Tek sayi...");
         }else {
             System.out.println("Gecerli bir sayi giriniz....");
         }
    }
}
