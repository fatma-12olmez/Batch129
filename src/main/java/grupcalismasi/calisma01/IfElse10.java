package grupcalismasi.calisma01;

import java.util.Scanner;

public class IfElse10 {
    public static void main(String[] args) {
          /*
         EXAMPLE 10:
        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        dort islemden biri ile isleme koyup yazdiriniz.
        */

        Scanner input =new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz...");
        int sayi1=  input.nextInt();
        int sayi2=input.nextInt();

        System.out.println("bir islem seciniz");
        char ch=input.next().charAt(0);

        if (ch=='+'){
            System.out.println(sayi1+sayi2);
        }else if(ch=='-'){
            System.out.println(sayi1-sayi2);
        }else if (ch=='*'){
            System.out.println(sayi1*sayi2);
        }else if (ch=='/'){
            System.out.println(sayi1/sayi2);
        }else {
            System.out.println("Gecerli bir sayi giriniz");
        }

    }
}
