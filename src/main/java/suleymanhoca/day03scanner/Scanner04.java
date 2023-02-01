package suleymanhoca.day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");

        double firstnumber=input.nextDouble();

        double secondnumber=input.nextDouble();

        System.out.println(firstnumber+secondnumber);

        System.out.println(firstnumber-secondnumber);

        System.out.println(firstnumber*secondnumber);

        System.out.println(firstnumber/secondnumber);


    }
}
