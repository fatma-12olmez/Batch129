package selfstudy.forloop;

import java.util.Scanner;

public class Soru06 {
    public static void main(String[] args) {
        //Interview Question
        // Kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den başlayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //	sayi 3'un kati ise sayi yerine "Java” yazdirin.
        //	sayi 5'in kati ise sayi yerine "Güzeldir” yazdirin.
        //	sayi hem 3'un hem 5'in kati ise sayi yerine "Java Güzeldir” yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("100'den kucuk bir tam sayi giriniz");
        int num = input.nextInt();


        for (int i = 1; i < num; i++) {


            if (i % 3 == 0) {

                System.out.println(i);
            } else if (i % 5 == 0) {

                System.out.println(i);

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.println(i);



            }
        }
    }
}


