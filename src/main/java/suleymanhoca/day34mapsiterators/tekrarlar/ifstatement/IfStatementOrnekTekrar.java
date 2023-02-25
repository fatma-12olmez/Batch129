package suleymanhoca.day34mapsiterators.tekrarlar.ifstatement;

import java.util.Scanner;

public class IfStatementOrnekTekrar {
    public static void main(String[] args) {
        //Example; Gunu yazdiginizda kacinci gun oldugunu yazan bir kod yaziniz

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen  gun oldugunu giriniz...");
        String gun=  input.next();
        if (gun.equals("Sunday")){
            System.out.println(1);
        }else if (gun.equals("Monday")){
            System.out.println(2);
        }else if (gun.equals("Tuesday")){
            System.out.println(3);
        }else if (gun.equals("Wednesday")){
            System.out.println(4);
        }else if (gun.equals("Thursday")) {
            System.out.println(5);
        }else if (gun.equals("Friday")) {
            System.out.println(6);
        }else if (gun.equals("Saturday")){
            System.out.println(7);
        }else{
            System.out.println("gecerli bir gun giriniz...");
        }
    }
}
