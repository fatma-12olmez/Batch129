package grupcalismasi.calisma03;

public class Soru05 {
    public static void main(String[] args) {
        // EXAMPLE 5:
        // 40'den 23'e kadar tum cift tamsayilari yazdiran kodu yaziniz.

        for (int i=40;i>22 ;i--){
            if (i%2==0) {
                System.out.print(i + " ");
            }
        }
    }
}
