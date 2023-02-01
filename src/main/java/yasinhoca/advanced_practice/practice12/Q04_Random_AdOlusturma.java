package yasinhoca.advanced_practice.practice12;

public class Q04_Random_AdOlusturma {

    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve
    // bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.

    public static void main(String[] args) {
        String alfabe = "abcçdefgğhıijklmnoöpqrsştuüvyzABCÇDEFGĞHIİJKLMNOÖPQRSTUÜVYZ ";
        String isim = "Fatma Olmez";
        String yaniIsim = "";

        int sayac = 0;

        for (int i = 0; i < isim.length(); i++) {

            while (true) {
                char rasgeleHarf = alfabe.charAt((int) (Math.random() * alfabe.length()));
                sayac++;
                if (isim.charAt(i) == rasgeleHarf) {
                    yaniIsim += rasgeleHarf;
                    System.out.println("sayac = " + sayac);
                    System.out.println("yaniIsim = " + yaniIsim);
                    break;
                }
            }
        }
        System.out.println("sayac = " + sayac);
    }


}
