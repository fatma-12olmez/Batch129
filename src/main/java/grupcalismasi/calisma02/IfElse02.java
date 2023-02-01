package grupcalismasi.calisma02;

import java.util.Scanner;

public class IfElse02 {
    public static void main(String[] args) {
          /*
    EXAMPLE 2:

    Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdiriniz
     */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir character giriniz...");
        char ch=input.next().toUpperCase().charAt(0);

        if  (ch>='A'&& ch<='Z'){
            System.out.println("harf");
        }else {
            System.out.println("harf degil...");
        }
    }
}
