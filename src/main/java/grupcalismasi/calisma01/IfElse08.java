package grupcalismasi.calisma01;

import java.util.Scanner;

public class IfElse08 {
    public static void main(String[] args) {

         /*
        EXAMPLE 8:

    Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.
        - 0-4 arasi "Bebek"
            - 5-12 arasi "Cocuk"
            - 13-20 arasi "Genc"
            - 21-30 arasi "Yetiskin
    Tanimlanmamis Evre
    Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
        */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        int age=input.nextInt();



        if (age<0){
            System.out.println("Gecerli bir yas giriniz...");
        }else if(age<5){
            System.out.println("Bebek");
        }else if(age<13){
            System.out.println("Cocuk");
        }else if(age<21){
            System.out.println("Genc");
        }else if(age<31) {
            System.out.println("Yetiskin");
        }else {
            System.out.println("Tanimlanmamis....");

        }
    }
}
