package selfstudy.forloop.ssg;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {



  /*
    Soru 2) Kullanicidan email adresini girmesini isteyin,

    mail@gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
    @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
    @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

   */
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir email adresi giriniz");
        String email = input.nextLine();

        if (!email.contains("gmail.com")) {
            System.out.println(" lutfen gmail adresini giriniz ");
        } else if (email.endsWith("gmail.com")) {

        } else {
            System.out.println("email adresiniz kaydedildi");
        }

    }

}
