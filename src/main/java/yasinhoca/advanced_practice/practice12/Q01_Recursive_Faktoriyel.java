package yasinhoca.advanced_practice.practice12;

public class Q01_Recursive_Faktoriyel {
    ////Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
    public static void main(String[] args) {

        System.out.println(factoriel(5));
    }

    public static int factoriel(int sayi) {

        if (sayi >= 0) {
            if (sayi == 0 || sayi == 1) {
                return 1;

            } else {
                return sayi * factoriel(sayi - 1);
            }
        } else {
            throw new ArithmeticException("Sayi sifirdan kucuk olamaz");//void bir islemde kullanilamaz
        }
    }
}
