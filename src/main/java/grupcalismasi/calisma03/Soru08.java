package grupcalismasi.calisma03;

import java.util.Scanner;

public class Soru08 {
    public static void main(String[] args) {
          /*
        EXAMPLE 8:
        Kullanicidan iki sayi ve yapilacak islemi alan ve toplama,
        cikarma, bolme, carpma ve % islemlerini yapan kodu yaziniz.

        */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz...");
        int num1=input.nextInt();
       int num2=input.nextInt();

        System.out.println("+,-, /, *  veya  % isleminden birini seciniz" );
        char symbol=input.next().charAt(0);

        switch (symbol){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1*num2/100);
                break;
            default:
                System.out.println("Gecerli bir sayi veya islem giriniz...");
        }
    }
}
