package grupcalismasi.calisma01;

import java.util.Scanner;

public class IfElse04 {
    public static void main(String[] args) {


        // EXAMPLE 4: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num= input.nextInt();

        if (num%2==0){
            System.out.println("sayi cifttir...");
        }else if (num%2!=0){
            System.out.println("Sayi tektir...");
        }else {
            System.out.println("gecerli bir sayi giriniz");
        }
    }
}
