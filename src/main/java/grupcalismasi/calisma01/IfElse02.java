package grupcalismasi.calisma01;

public class IfElse02  {

    public static void main(String[] args) {


        // EXAMPLE 2: Verilen sayi cift sayi ise ekrana "Cift sayi" yazdiran kodu olusturun

        int  num=122;

        if (num%2==0){
            System.out.println("sayi cift");
        }else if (num%2!=0){
            System.out.println("sayi tek");
        }else{
            System.out.println("Gecerli bir sayi giriniz...");
        }
    }
}
