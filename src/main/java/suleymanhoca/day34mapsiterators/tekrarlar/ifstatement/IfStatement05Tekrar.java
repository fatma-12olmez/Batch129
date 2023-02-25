package suleymanhoca.day34mapsiterators.tekrarlar.ifstatement;

import java.util.Scanner;

public class IfStatement05Tekrar {
    public static void main(String[] args) {

        // Ay  isimlerini girilince kacinci ay oldugunu yazan kodu yaziniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Ay ismi giriniz...");
        String ay=input.next();

        if (ay.equalsIgnoreCase("January")){
            System.out.println(1);
        }else if (ay.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if (ay.equalsIgnoreCase("March")) {
            System.out.println(3);
        }else if (ay.equalsIgnoreCase("April")) {
            System.out.println(4);
        }else if (ay.equalsIgnoreCase("May")) {
            System.out.println(5);
        }else if (ay.equalsIgnoreCase("June")) {
            System.out.println(6);
        }else if (ay.equalsIgnoreCase("July")) {
            System.out.println(7);
        }else if (ay.equalsIgnoreCase("August")) {
            System.out.println(8);
        }else if (ay.equalsIgnoreCase("September")) {
            System.out.println(9);
        }else if (ay.equalsIgnoreCase("October")) {
            System.out.println(10);
        }else if (ay.equalsIgnoreCase("November")) {
            System.out.println(11);
        }else if (ay.equalsIgnoreCase("December")) {
            System.out.println(12);
        }else {
            System.out.println("Gecerli bir ay ismi giriniz");
        }
    }
}
