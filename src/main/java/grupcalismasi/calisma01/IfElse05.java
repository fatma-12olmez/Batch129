package grupcalismasi.calisma01;

public class IfElse05 {
    public static void main(String[] args) {

        // EXAMPLE 5: Verilen bir sayinin negetif, pozitif yada notr oldugunu soyleyen kodu yaziniz.

        int sayi=-17;
        if (sayi<0){
            System.out.println("negatif...");
        }else if(sayi>0){
            System.out.println("pozitif");
        }else if(sayi==0) {
            System.out.println("notr");
        }else {
            System.out.println("Gecerli bir sayi deneyiniz");
        }
    }
}
