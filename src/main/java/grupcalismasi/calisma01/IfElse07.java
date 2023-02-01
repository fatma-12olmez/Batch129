package grupcalismasi.calisma01;

import java.util.Scanner;

public class IfElse07 {
    public static void main(String[] args) {

        // EXAMPLE 7: Kullanicidan gun isimlerini aliniz haftaici mi haftasonu mu oldugunu yazdiran kodu olusturunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz...");
        String dayName = input.next();

        if (dayName.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Haftaici");
        } else if (dayName.equalsIgnoreCase("Sali")) {
            System.out.println("Haftaici");
        } else if (dayName.equalsIgnoreCase("Carsamba")){
            System.out.println("Haftaici");
        }else if (dayName.equalsIgnoreCase("Persembe")){
            System.out.println("Haftaici");
        }else if (dayName.equalsIgnoreCase("Cuma")){
            System.out.println("haftaici");
        }else if(dayName.equalsIgnoreCase("Cumartesi")){
            System.out.println("haftasonu");
        }else if (dayName.equalsIgnoreCase("Pazar")){
            System.out.println("haftasonu");
        }else{
            System.out.println("gecerli bir gun ismi giriniz...");
        }
    }

}
