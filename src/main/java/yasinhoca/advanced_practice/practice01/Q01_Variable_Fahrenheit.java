package yasinhoca.advanced_practice.practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variable_Fahrenheit {
    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  Fahrenheit degeri giriniz");
        double f = input.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Celcius: " + c);

        //ondalik kismi belirli bir formatta yazdirmak icin
        //1.Yol decimalFormat class

        DecimalFormat format = new DecimalFormat("0.00");
        String formattedCelcius = format.format(c);
        System.out.println("formattedCelcius: " + formattedCelcius);

        //2.Yol:Printf ile;

        System.out.printf("printf ile : " + "  %.2f", c);// %==>herhangi bir sayi,2f ==>iki basamakli format





    }
}
