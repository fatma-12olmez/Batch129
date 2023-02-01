package selfstudy.forloop;

import java.util.Scanner;

public class Soru08 {
    public static void main(String[] args) {

        //Kullanicidan bir String isteyin.Kullanicinin girdigi String'in palidrome olup olmadigini kontrol eden bir program yazin;


        Scanner input=new Scanner(System.in);
        System.out.println("String bir ifade giriniz.");
        String s=input.nextLine();

        String t="";

        for (int i=s.length()-1;i>=0;i--) {

            t = t + s.charAt(i);
        }
        if (s.equals(t)){
            System.out.println("palindrom");
        }else {
            System.out.println("palindrome degil");


        }
    }
}
