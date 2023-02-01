package suleymanhoca.day28exceptions;

public class Exceptions05 {
    public static void main(String[] args) {


        int a = 16;
        int b = 5;
        String s = "My Java";

      getCharFromString(s,a,b);


    }

    //Try kisminda birden fazla exception olusturma ihtimali olan code varsa ,coklu catch kullanabilirsiniz.

    // Coklu "catch" kullandiginizda  Exception Class'lar arasinda "parent-child" iliskisi yoksa catch'lerin sirasi onemli degildir.
    // Ama koddaki siralamaya uymak tavsiye edilir.

    //Coklu "catch" kullandiginizda  Exception Class'lar arasinda "parent-child" iliskisi varsa,  catch'lerin sirasi onemlidir,
    //child olan class ustte olmalidir

    //Exception Class'lar arasinda "parent - child" iliskisi varsa, ya child class'i uste yazarak child ve parent class'lar
//icin ozellestirilmis code'lar yazarsiniz.(Hirsiz icin 155, hasta icin 112 gibi)
//Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz.(Hirsiz icin 911, hasta icin 911 gibi)
    public static void getCharFromString(String s,int a,int b) {

        try {
            int idx = a / b;

            char ch = s.charAt(idx);

            System.out.println(ch);

        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e ){
            System.out.println("Olmayan index kullandiniz");
        }
        //Coklu exception olma ihtimaline karsi try dan sonra coklu catch de kullanabilirsiniz.
    }
}
