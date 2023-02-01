package suleymanhoca.day28exceptions;

public class Exceptions01 {



        /*

          1)Exception demek beklenmedik problem demektir. Seyehatte benzinin bitmesi, arabanin bozulmasi gibi...
          2)Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir. Mesela benzin bitince
             yol yardimi arariz.
          Applicationlarda da beklenmedik problemler icin cozum yollari uretmeliyiz,bu isleme "Exception Handling" denir.
          3)Exception'lar temel olarak ikiye ayrilirlar.
                i)Compile Time Exception:Siz code yazarken farkedilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir.
               ii)Run Time Exception:Siz code yazarken farkedilmez ama,code'u calistirdiginizda console'da hata alirsiniz.
          4)Exception'lar disinda "Error" diye adlandirdigimiz "Handle"edilemeyen problemler vardir.
           Gercek hayatta sofor'un olmesi gibi,Handle edilemeyecek durumlar "Error"dur.
           Applicationlar'da  "Memory"nin dolmasi "Error"dur.
           Iki tur memory var i)Stack Memory dolarsa "StackOverFlow" alirsiniz.
                              ii)Heap Memory dolarsa "OutOfMemory Error" alirsiniz
        5)Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
        6)if else kullanirsak olusabilecek her problemi spesifik olarak if parantezinin icine yazmamiz gerekir.
               Bu da ciddi bir matematik bilgisi gerektirir ve yazacagimiz code u cok uzatir.
              Ama try catch'te Java ilgili Exception ile alakali olusabilecek butun problemleri yakalar.


         */

    public static void main(String[] args) {

        int a=12;
        int b=0;

        divide(a,b);
        divide2(a,b);

    }

    //ArithmeticException yazdiginiz code'da matematiksel islem kullaniyorsaniz alinabilecek bir Exceptiondir.
    //Nasil handle edilecegini asagida yazdik.
    public static void divide (int a,int b){
        try {

            System.out.println(a/b);
            System.out.println("I am here");
        }catch (ArithmeticException e){ //Note: Catch'in calısması icin Exception almamız gerekir

            System.out.println("Do not divide by zero");   ////Exception olustugunda Java calismayi durdurur
        }
        System.out.println("You are here");

    }

    //"Execption Handling" de if else kullanilmaz.(bknz.6.not'a)
    public static void divide2(int a, int b){
        if (b==0){
            System.out.println("Do not divide by zero");
        }else {
            System.out.println(a/b);
        }
    }
    // Why we use try-catch instead of using if-else ?
    //if else kullanirsak olusacak her problemi spesifik olarak tum ihtimalleri gozetmemiz gerekir.
    //Ama try catch'te boyle bir seye gerek yok. Try Catch'te ne hatasi olursa olsun her exception'i yakalar.

}
