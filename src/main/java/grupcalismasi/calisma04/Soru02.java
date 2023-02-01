package grupcalismasi.calisma04;

public class Soru02 {
    public static void main(String[] args) {
        /*
     Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
    a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
    b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
    c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
 */

        int a = 5;
        int b = 12;
        int c = 12;

        String hangiUcgen = a ==b && b ==c  ? "Eskenar": (a == b && b != c || b==c && a !=c || a==c && b!=a) ? "Ikizkener":"Cesit kenar";

        System.out.println(hangiUcgen);


    }
}
