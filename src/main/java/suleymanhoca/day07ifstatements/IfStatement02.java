package suleymanhoca.day07ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Example 2: Kullanicadan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num=input.nextInt();
        /*

        if(num%2==0){
            System.out.println("Cift Sayi...");
        }if (num%2!=0){
            System.out.println("Tek sayi...");
        }

         */

        // 2.Yol
        if(num%2==0) {
            System.out.println("Cift Sayi...");
        }else{
            System.out.println("Tek sayi...");
        }
    }
}
