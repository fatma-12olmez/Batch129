package tekrarlar.Scanner;

import java.util.Scanner;

public class scanner01Tekrar {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        byte age=input.nextByte();
        System.out.println(age);
    }



    //2.Adim:Kullaniciya ne istediginize dair mesaj veriniz
    //3.Adim:Uygun method'u kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz.
}
