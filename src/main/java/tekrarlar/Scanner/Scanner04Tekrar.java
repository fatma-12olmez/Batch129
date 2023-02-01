package tekrarlar.Scanner;

import java.util.Scanner;

public class Scanner04Tekrar {
    //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz...");
        double firstnumber=input.nextDouble();
        double secondNumber=input.nextDouble();

        System.out.println(firstnumber+secondNumber);
        System.out.println(firstnumber-secondNumber);
        System.out.println(firstnumber*secondNumber);
        System.out.println(firstnumber/secondNumber);
    }
}
