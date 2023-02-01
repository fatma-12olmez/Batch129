package selfstudy.forloop;

import java.util.Scanner;

public class Q01 {
    /*
   Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
         X X X X X
         X X X X X
         X X X X X
*/
    public static void main(String[] args) {














        Scanner input = new Scanner(System.in);

        System.out.println("Satir sayisini giriniz ");
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz ");
        int sutun = input.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int k = 1; k <= sutun; k++) {
                System.out.print("X ");
            }
            System.out.println();

        }
    }
}
