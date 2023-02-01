package selfstudy.nestedloop;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

        /*Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        *
        * *
        * * *
        * * * *

         */


        Scanner input=new Scanner(System.in);

        System.out.println("Pozitif bir rakam giriniz");
       int rakam= input.nextInt();

       for (int i=1;i<=rakam;i++){

           for (int k=1;k<=i;k++){

               System.out.print("* ");
           }
           System.out.println();
       }



    }
}
