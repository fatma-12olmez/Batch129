package selfstudy.whileloop;

public class WhileLoop01 {

    public static void main(String[] args) {
        //While loop kullanarak 3'den 13'e kadar tum tek sayilari ekrana yazdiriniz.

        int sayi = 3;
        while (sayi < 14) {
            if (sayi % 2 != 0) {
                System.out.print(sayi + " ");


            }
            sayi++;

        }

    }

}
