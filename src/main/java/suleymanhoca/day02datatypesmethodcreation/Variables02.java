package suleymanhoca.day02datatypesmethodcreation;

public class Variables02 {

    /*
    Non-primitive Data Types :String bir non-primitive data type'dir.
                             Uretilen her bir class ayni zamanda bir non-primitive data type'tir
                              Bu yuzden non-primiitive data type'lar sinirsiz sayidadir denebilir.
                              Non-primitive data type'larin isimleri buyuk harfle baslar.
                              Non-primitive data type'larin tamami icin java memory'de ayni miktarda yer ayirir.




          Interview sorusu:"Primitive" ve "non-primitive data type'lari arasindaki farklar nedir?
                            1)"Primitive"ler sadece bizim atadigimiz degeri icerir
                              "non-primitive"ler bizim atadigimiz deger ve methodlar icerir.
                            2)"primitive"ler kucuk harfle baslar "non-primitive"ler buyuk harfle baslar
                            3)"primitive"leri Java uretmistir ve 8 tanedir
                            "non-primitive"leri Java ve Developer'lar uretebilir,sinirsiz sayidadir
                            4)"primitive" ler memory'de data type'ina gore yer kaplar,
                               "non-primitive" ler icin Java memeory'de hep ayni buyuklukte yer ayirir.


     */
    public static void main(String[] args) {

        //Ornek 1:Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin

        String  cityName="Strasbourg";
        System.out.println(cityName);
    }
}
