package grupcalismasi.calisma01;

import java.util.Scanner;

public class Ifelse01 {


    public static void main(String[] args) {

        // EXAMPLE 1: Verilen karakter buyuk harf ise ekrana "Buyuk harf" yazan kodu olusturunuz.


        Scanner input=new Scanner(System.in);
        System.out.println("Bir character giriniz...");
        char cha= input.next().charAt(0);
        if (cha>='A' && cha<='Z') {
            System.out.println("buyuk harf");
        }else if (cha >= 'a' && cha <='z') {
                System.out.println("kucuk harf");
            }else {
                System.out.println("Lutfen gecerli bir character giriniz...");
        }




    }


}
