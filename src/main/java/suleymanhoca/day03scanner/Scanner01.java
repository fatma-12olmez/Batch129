package suleymanhoca.day03scanner;

import java.util.Scanner;

public class Scanner01 {

    //Kullanicidan data alip kodlarimizda kullanacagiz.


    public static void main(String[] args) {

        //1.Adim:Scanner class'dan object olustur
        Scanner input=new Scanner(System.in);
        //2.Adim:Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("lutfen yasinizi giriniz...");
        //3.Adim:Uygun method'u kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz.
        Byte age= input.nextByte();
        System.out.println(age);



    }


}
