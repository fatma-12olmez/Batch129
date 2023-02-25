package suleymanhoca.day34mapsiterators.tekrarlar.Scanner;

import java.util.Scanner;

public class Scanner02Tekrar {


    //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("isminizi giriniz");
         String firstName=input.next();
        System.out.println("Soyisminizi giriniz");
        String lastName=input.next();

        System.out.println(firstName+lastName);
    }
}
