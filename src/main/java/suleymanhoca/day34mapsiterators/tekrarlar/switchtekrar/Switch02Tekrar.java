package suleymanhoca.day34mapsiterators.tekrarlar.switchtekrar;

import java.util.Scanner;

public class Switch02Tekrar {


        //Gecerli gun sayisi "girdiginde" (geri kalan) tum gunleri yazdir
        public static void main(String[] args) {

            Scanner scan= new Scanner(System.in);
            System.out.println("geçeerlı gü^n sayısı gırınız");
            int gunIsmi= scan.nextInt();

            switch (gunIsmi){
                case(1):
                    System.out.println("Sunday");
                case(2):
                    System.out.println("Monday");
                case(3):
                    System.out.println("Tuesday");
                case(4):
                    System.out.println("wednesday");
                case(5):
                    System.out.println("thursday");
                    break;
                case(6):
                    System.out.println("frıday");
                    break;
                    case(7):
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("lü^tfen geçerl² sayı gırınız");
            }

        }
}
