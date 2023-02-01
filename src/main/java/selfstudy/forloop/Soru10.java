package selfstudy.forloop;

import java.util.Scanner;

public class Soru10 {

    public static void main(String[] args) {
        //Kullanicidan 10'dan kucuk bir tamsayi isteyin ve girilen sayinin faktoryel'i bulun(5!=5*4*3*2*1)

        Scanner input = new Scanner(System.in);
        System.out.println("10 dan kucuk bir tam sayi giriniz");
        int num = input.nextInt();

        int carpim = 1;

        for (int i = num; i > 0; i--) {

            carpim=carpim*i;

            System.out.print(i+"*");
        }
        System.out.println();

        System.out.println("carpim "+carpim);
    }
}
