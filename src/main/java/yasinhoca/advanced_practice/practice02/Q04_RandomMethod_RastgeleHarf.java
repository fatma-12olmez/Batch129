package yasinhoca.advanced_practice.practice02;

public class Q04_RandomMethod_RastgeleHarf {
    /*
        Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
        Diğerleri için “Diğer Karakterleri” yazdırınız.
        */

    public static void main(String[] args) {

       String rastgeleHarf=rastgeleharf().toLowerCase();
       switch (rastgeleHarf){
           case "a":
               System.out.println("Ilk Karakter");
               break;
           case "b":
               System.out.println("Ikinci Karakter");
               break;
           case "c":
               System.out.println("Uçuncu Karakter");
               break;
           case "d":
               System.out.println("Dorduncu Karakter");
               break;
           default:
               System.out.println("Diger Karakterler");
       }


    }
    public static String rastgeleharf(){
        String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex=alfabe.length();
       int rastgeleIndex= (int) (Math.random()*maxIndex);

      return alfabe.substring(rastgeleIndex,rastgeleIndex+1);

        }
   }
