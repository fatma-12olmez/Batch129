package selfstudy.forloop;

import java.util.Scanner;

public class soru05 {
    public static void main(String[] args) {
        //Kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den başlayarak girilen sayiya kadar 3'un veya 5”in kati olan sayilari yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("100'den kucuk bir tam sayi giriniz");
        int num = input.nextInt();

        for (int i = 1;i<num;i++ ) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");

            }
        }

    }
}
