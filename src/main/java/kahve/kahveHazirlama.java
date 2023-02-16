package kahve;

import java.util.Scanner;

public class kahveHazirlama {
    public static void main(String[] args) {


        kahveCesiti();
        sut();
        seker();
        boyut();




    }

    public static void seker() {
        Scanner input = new Scanner(System.in);
        System.out.println("Seker eklemek ister msiniz? Evet ve Hayir olarak cevaplayiniz.");
        String seker = input.next().toLowerCase();

        if (seker.equals("evet")) {

            System.out.println("Kac seker istersiniz?");
            int kacSeker = input.nextInt();
            if (kacSeker > 0) {
                System.out.println(kacSeker + " sekeriniz ekleniyor");
            }

        } else {
            System.out.println("Seker eklenmiyor..");
        }
    }

    public static void sut() {
        Scanner input = new Scanner(System.in);
        System.out.println("sut eklememizi ister msiniz? Evet ve Hayir olarak cevaplayiniz.");
        String sut = input.next().toLowerCase();
        if (sut.equals("evet")) {
            System.out.println("Sut ekleniyor..");
        } else {
            System.out.println("Sut eklenmiyor..");
        }
    }

    public static void kahveCesiti() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Hangi kahveyi istersiniz? \n Turk Kahvesi \n Filtre Kahve \n Espresso");
            String hangiKahve = input.nextLine().toLowerCase();


            if (hangiKahve.equals("turk kahvesi") || hangiKahve.equals("filtre kahve") || hangiKahve.equals("espresso")) {
                System.out.println(hangiKahve + " Kahveniz Hazirlaniyor...");
                break;
            } else {
                System.out.println("Hatali Tuslama Yaptiniz.");
            }
        }
    }

    public static void boyut() {
        Scanner input = new Scanner(System.in);

        String boyut = input.next().toLowerCase();

        while (true) {


            System.out.println("Hangi boyutta olsun istersiniz? Buyuk-Orta-Kucuk olarak giriniz");


            if (boyut.equals("buyuk") || boyut.equals("orta") || boyut.equals("kucuk")) {
                System.out.println(boyut + " boy kahveniz hazirlaniyor..");

            } else {
                System.out.println("Lutfen gecerli bir secim giriniz");
            }
            break;
        }
    }
}
