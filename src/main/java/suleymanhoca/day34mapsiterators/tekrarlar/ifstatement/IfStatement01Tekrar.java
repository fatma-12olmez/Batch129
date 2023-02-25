package suleymanhoca.day34mapsiterators.tekrarlar.ifstatement;

import java.util.Scanner;

public class IfStatement01Tekrar {
    public static void main(String[] args) {


        //Example 1:Verilen character buyuk harf ise ekrana "Buyuk harf" yazdiran kucuk harf ise ekrana "Kucuk harf" yazdiran kodu olusturunuz.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir caharacter giriniz...");
        char ch= input.next().charAt(0);

        if (ch>='A'&& ch<='Z'){
            System.out.println("Buyuk harf...");
        } else if(ch>='a' && ch<='z' ) {
            System.out.println("Kucuk harf...");
        }else {
            System.out.println("harf degil...");
        }


    }
}
