package grupcalismasi.calisma02;

import java.util.Scanner;

public class IfElse07 {
    public static void main(String[] args) {

        /*

        EXAMPLE 7 :
          Kullanicidan 100 uzerinden notunu isteyin. Not'u harf sistemine cevirip yazdirin.
        50'den kucukse "D", 51-60 arasi "C", 60-80 arasi "B", 80'nin uzerinde ise "A"

                */
        Scanner input =new Scanner(System.in);
        System.out.println("100  uzerinden bir not giriniz...");
        int not=input.nextInt();

        if (not<51){
            System.out.println("D");
        }else if (not<61){
            System.out.println("C");
        }else if (not<81){
            System.out.println("B");
        }else if (not<101){
            System.out.println("A");
        }else {
            System.out.println("100'den kucuk gecerli bir not giriniz...");
        }
    }
}
