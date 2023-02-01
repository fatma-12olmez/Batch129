package yasinhoca.advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Variable_Hipotenus {

    /*
   Scanner input =new Scanner(System.in);

        System.out.println("1.dik kenar uzunlugunu giriniz");
        int a=input.nextInt();
        System.out.println("2.dik kenar uzunlugunu giriniz");
        int b=input.nextInt();

      double hipotenus = Math.sqrt(a*a+b*b);
        System.out.println("hipotenus : " + hipotenus);

         */


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("1.dik kenar uzunlugu giriniz");
        double a = input.nextInt();
        System.out.println("2.dik kenar uzunlugu giriniz");
        double b = input.nextInt();

        double hipotenus = Math.sqrt(a * a + b * b);
        System.out.println("hipotenus = " + hipotenus);
}



















}
