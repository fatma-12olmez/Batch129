package selfstudy.forloop;

import java.util.Scanner;

public class Soru07 {
    public static void main(String[] args) {

        //Kullanicidan bir String  isteyin ve string'i tersten yazdiran bir kod yazin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen string bir ifade yaziniz.");
        String str = input.next();

        String t="";
        for (int i=str.length()-1;i>=0;i--){

            t=t+str.charAt(i);

        }
        System.out.println(t);






















    }
}
