package suleymanhoca.day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
     Java da method nasil olusturulur?

     1)Main methodun disinda olusturulur.
     2)Access modifier +Return type+ Method ismi(){}

     Olusturulan methodlar nasil kullanilir?
     1)main method'un icinden kullanilir
     2)methodun ismini +() yazin
     3)Islem yapacaginiz sayilari parantezin icine koyun



     */
    public static void main(String[] args) {

       int sonuc= add(30,50);
        System.out.println(sonuc);

       long carpmasonucu= multiply(3,6);
        System.out.println(carpmasonucu);

       int uclusonuc= firstTwomultiplyThirdAdd(2,5,8);
        System.out.println(uclusonuc);

      double kup =getCube(5);
        System.out.println(kup);



    }


    public static int add(int a, int b){
       return a+b;
    }

      protected static long multiply(int a,int b){
        return a*b;

    }

    // Ornek1 :Verilen 3 sayidan ilk ikisni carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz ve kullaniniz

    private static int  firstTwomultiplyThirdAdd(int a,int b,int c){
        return a*b+c;

    }
    //Ornek 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.
    //Note: Access modifier'i' default yapmak access modifier i yazmayiz

     static double getCube(double a){
        return a*a*a;
       }

     //1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
     //2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
     //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
     //4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz


  }
