package suleymanhoca.day34mapsiterators.tekrarlar.switchtekrar;

import java.util.Scanner;

public class switch03Tekrar {
    //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz/Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz



    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz...");
        int num1=input.nextInt();
        int num2=input.nextInt();

        System.out.println("+, -, *, /, %  islemlerinden birini giriniz");
        char opr=input.next().charAt(0);

        switch (opr){

            case('+'):
                System.out.println(num1+num2);
                break;
            case('-'):
                System.out.println(num1-num2);
                break;
            case('*'):
                System.out.println(num1*num2);
                break;
            case('/'):
                System.out.println(num1/num2);
                break;
            case('%'):
                System.out.println(num1*num2/100);
              break;
            default:
                System.out.println("bu islem tamamlanmamistir...");
        }



    }

}
