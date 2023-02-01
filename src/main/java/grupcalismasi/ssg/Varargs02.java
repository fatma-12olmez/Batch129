package grupcalismasi.ssg;

public class Varargs02 {
    public static void main(String[] args) {

        //Bir ogrencinin ismi,soyismi,sinifi yas icin bir method olusturun
        ogrenciBilgisi("fatma","olmez","12A",28);
        ogrenciBilgisiYazdir(28,"fatma","olmez","12A");
    }

    public static void ogrenciBilgisi(String isim,String soyisim,String sinif,int yas){
        System.out.println(isim+ " "+soyisim+ " " +sinif + " "+yas);
    }
    public static void ogrenciBilgisiYazdir(int yas,String...str){
        for (String w:str){
            System.out.print(w+" ");
        }
        System.out.println("ogrencinin yasi : "+yas);
    }
}
