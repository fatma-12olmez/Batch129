package suleymanhoca.day34mapsiterators.tekrarlar.ifstatement;

import java.util.Scanner;

public class IfStatement04Tekrar {
    public static void main(String[] args) {
        //Example; Gun sayisini verdiginizde gun ismini yazan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu  giriniz");
        byte num = input.nextByte();

        if (num == 1) {
            System.out.println("Sunday");
        } else if (num == 2) {
            System.out.println("Monday");
        } else if (num == 3) {
            System.out.println("Tuesday");
        } else if (num == 4) {
            System.out.println("Wednesday");
        } else if (num == 5) {
            System.out.println("Thursday");
        } else if (num == 6) {
            System.out.println("Friday");
        } else if (num == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Lutfen gecerli bir sayi giriniz...");

        }

    }
}
