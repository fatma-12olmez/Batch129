package grupcalismasi.calisma03;

public class Soru06 {
    public static void main(String[] args) {
          /*
            EXAMPLE 6:
            Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan karakterlerini buyuk harf yapiniz.


         */

        String word="ankara";

        for (int i=0;i<word.length(); i++) {

            String  ch=word.substring(i ,i+1);
            if (i%2==0) {

                System.out.print(ch.toUpperCase());
            }
        }

    }
}
