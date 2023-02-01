package grupcalismasi.calisma05;

import java.util.Scanner;

public class CarpimTablosu {
    public static void main(String[] args) {
        //Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        // 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        Scanner input=new Scanner(System.in);
        System.out.println("ogrenmek istedigin sayiyi giriniz");
        int sayi=input.nextInt();
        for (int i=1; i<11;i++){
            System.out.println(sayi +"x" + i + " = "+(sayi*i));
        }
    }
}
