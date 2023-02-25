package suleymanhoca.day34mapsiterators.tekrarlar.Scanner;

import java.util.Scanner;

public class Scanner05Tekrar {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)alanini hesaplayiniz ==>kisa kenar* uuzun kenar
        //ii)cevresini hesaplayiniz==>2*Kisa kenar+ 2*uzun kenar
        Scanner input=new Scanner(System.in);
        System.out.println("iki kenar uzunlugu giriniz");

        double kisaKenar=input.nextDouble();
        double uzunKenar=input.nextDouble();

        System.out.println("alan: "+(kisaKenar*uzunKenar));
        System.out.println("cevre: "+(2*kisaKenar+2*uzunKenar));

    }
}
