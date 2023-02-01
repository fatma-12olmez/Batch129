package grupcalismasi.calisma04;

import java.util.Scanner;

public class Soru03 {
    public static void main(String[] args) {
        /*
     Yazdırmak için switch ifadesini kullanınız.
    a) Aralık, Ocak, Şubat için "Kış"
    b) Mart, Nisan, Mayıs için "Bahar"
    c) Haziran, Temmuz, Ağustos için "Yaz"
    d) Eylül, Ekim, Kasım için "Güz"
    e) Diğerleri için "Geçersiz ay adı"

 */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Ay ismi giriniz");
        String ayIsmi=input.next().toLowerCase();

        switch (ayIsmi){
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("Kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("Bahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("gecerli bir ay giriniz");

        }

    }
}
