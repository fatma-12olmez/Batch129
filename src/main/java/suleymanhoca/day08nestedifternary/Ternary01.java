package suleymanhoca.day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Kullanicidan iki sayi aliniz"buyuk olmayan"(kucuk veya esit olan)sayiyi yazdiriniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //1.yol;
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        //2.Yol:Ternary
        //            Condition   ?  condition true ise calisir  : condition false ise calisir  ;
        double result = a < b ? a : b;
        System.out.println(result);


    }
}
