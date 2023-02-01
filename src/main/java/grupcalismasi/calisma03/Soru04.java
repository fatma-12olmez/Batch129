package grupcalismasi.calisma03;

public class Soru04 {
    public static void main(String[] args) {


        // EXAMPLE 4
        // Iki sayinin isareti ayni ise bu sayilari carpan,
        // isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

        int num1=-5;
        int num2=4;
        if (num1<0 &&num2<0 || num1>0 && num2>0){
            System.out.println(num1*num2);
        }else {
            System.out.println("Farkli isaretli sayilari carpamiyorum ");
        }

         System.out.println( num1<0 &&num2<0 || num1>0 && num2>0 ? num1*num2 : "Farkli isaretli sayilari carpamiyorum ");


    }
}
