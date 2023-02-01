package grupcalismasi.calisma01;

public class IfElse03 {
    public static void main(String[] args) {

        // EXAMPLE 3: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana "harika sayi" yazdiran kodu olusturun

        int num=55555;
        if (num<300 || num>1200) {
            System.out.println("harika sayi");
        }else {
            System.out.println("Yeniden deneyiniz...");
        }
    }
}
