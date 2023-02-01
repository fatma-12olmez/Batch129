package grupcalismasi.calisma02;

import java.util.Scanner;

public class IfElse04 {
    public static void main(String[] args) {
         /*
    EXAMPLE 4:

    Kullanicidan bir ucgen uc kenar uzunlugunu alin eger uc kenar uzunlugunu birbirine esit ise
    ekrana "Eskenar ucgen " yazdiriniz. diger durumlarda ekrana "Eskenar degil" yazdiriniz

     */

        Scanner input=new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini icin tam sayi  giriniz...");
       int kenar1= input.nextInt();
       int kenar2=input.nextInt();
       int kenar3=input.nextInt();

       if ((kenar1==kenar2)&&(kenar2==kenar3)&&(kenar1==kenar3)){
           System.out.println("Eskenar ucgen...");
       } else {
           System.out.println("Eskenar degil");
       }

    }
}
