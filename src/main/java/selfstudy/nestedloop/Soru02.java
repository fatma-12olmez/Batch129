package selfstudy.nestedloop;

import java.util.Scanner;

public class Soru02 {

    //Kullanicidan pozitif  bir rakam girmesini isteyin ve girilen rakama gore carpim tablosu olusturun.

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Pozitif bir rakam giriniz");
        int rakam = input.nextInt();

        for (int i=1;i<11;i++){

                System.out.println(rakam+"X"+i +"="+rakam*i);
            }
            System.out.println();
        }


    }

