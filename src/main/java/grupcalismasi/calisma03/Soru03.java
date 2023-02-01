package grupcalismasi.calisma03;

public class Soru03 {
    public static void main(String[] args) {


        // EXAMPLE 3:
        // Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        // Sayi negatifse -1 ile carpilir  -4 ==> -1 * 4     4 ==> 4   0 ==> 0


        int num=-9;

       int result= num<0 ? num*-1 :num;
        System.out.println("result : "+ result);

    }
}
