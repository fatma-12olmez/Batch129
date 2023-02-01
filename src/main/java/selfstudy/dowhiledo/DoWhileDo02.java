package selfstudy.dowhiledo;

import java.util.Scanner;

public class DoWhileDo02 {
    public static void main(String[] args) {
         /*
            Gecerli Username="admin" ve "Password"="pwd123"dur
            kullanicidan username ve password'u alin.
            username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
            Username ve password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
             Username ve password 4. kere yanlis girilirse  "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
         */
        Scanner input=new Scanner(System.in);
        int counter=0;

        do {
            if (counter==4){
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }
            System.out.println("Kullanici adinizi giriniz.");
            String username=input.next();
            System.out.println("Password'unuzu giriniz");
            String psw=input.next();

            if (username.equals("admin")&& psw.equals("pwd123")){
                System.out.println("Hesabiniza hos geldiniz");
                break;

            }
            counter++;

        }while (true);
    }
}
