package suleymanhoca.day02datatypesmethodcreation;

public class Variables01 {


        //primitive data types -->char-boolean-byte-short-int-long-float-double
        //float: Virgullu sayilar(ondalik sayilar_decimal number) icin kullanilir.(fiyatlandirmalar- 12.99)
        //double: Virgullu sayilar(ondalik sayilar_decimal number) icin kullanilir.(hucre agirligi: 0.00000000000112)

    //Note;primitive data type'larini Java olusturmustur biz olusturamayiz
    //Note:primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
    //Note:primitive datalar  data typelara gore memory de farkli farkli yer kaplarlar
    //Note:primitive datalar iclerinde sadece sizin atadiginiz degeri barindirir.

        public static void main(String[] args) {

            //ornek 1: gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiiriniz

            //Note:Java "Decimal Numbers"i otomatik olarak "double"kabul eder.
            //      siz  data type ini "float" yazarsaniz hata verir
            //      float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz
            //      float memory de 4 byte yer kaplar,double 8 byte yer kaplar
            float shirtPrice = 12.99F;
            float shoesPrice = 15.89F;
            // System.out.println();ekrana yazdirir ve "pointer"i bir sonraki satira koyar.
            // System.out.println(); ekrana yazdirir ve "pointer"i ayni satirda tutar.
            System.out.println(shirtPrice + shoesPrice);


            //Ornek 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin

            double weightCell = 0.000000000000112;
            double weightAmip = 0.0000000000000023;
            System.out.println(weightCell - weightAmip);//1.097E-13  "E==>Exponent"


        }
}
