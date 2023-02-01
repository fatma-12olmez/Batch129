package grupcalismasi.calisma04;

import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {

        /*
     myClass isminde bir class oluşturunuz, class'ta size rastgele bir alfabetik karakter veren bir
     yöntem oluşturun ve ardından yöntemi kullanarak aşağıdakileri yazdırınız.
     'A' ve 'a' için "İlk Karakter" yazdırınız.
     'B' ve 'b' için "İkinci Karakter" yazdırınız.
     'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
     'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
        Diğerleri için "Diğer Karakterleri" yazdırınız


 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = input.next().charAt(0);

        switch (harf) {
            case'A':
            case 'a':
                System.out.println("İlk Karakter");
                break;
        }

    }
}
