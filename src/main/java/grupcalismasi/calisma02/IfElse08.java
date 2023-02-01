package grupcalismasi.calisma02;

import java.util.Scanner;

public class IfElse08 {
    public static void main(String[] args) {

        /*
            Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
            teklif 80.000 arasinda ise "Kabul ediyorum ",
            60 - 80.000 arasinda ise "Konusabiliriz"
            60.000 'nin altinda ise "Maalesef Kabul edemem" yazdirin

            */
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen maas icin miktar giriniz...");
        double salary=input.nextDouble();

        if (salary>80.000){
            System.out.println("Kabul ediyorum ");
        }else if (salary<=80.00 && salary>=60.00){
            System.out.println("Konusabiliriz");
        }else if (salary<60.000){
            System.out.println("Maalesef Kabul edemem");
        }

    }
}
