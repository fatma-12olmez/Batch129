package yasinhoca.advanced_practice.practice11.abtstruction_alan_hesaplama;

public class AbstructionRunner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)
    public static void main(String[] args) {


        Diktdortgen dikdortgen = new Diktdortgen();
        System.out.println(dikdortgen.alanHesapla(5, 4));
        System.out.println(dikdortgen.alanHesapla(7, 4));


        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(6, 2));
        System.out.println(ucgen.alanHesapla(10, 5));


}

}
