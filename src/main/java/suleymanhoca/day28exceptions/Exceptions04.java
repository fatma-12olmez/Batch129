package suleymanhoca.day28exceptions;

public class Exceptions04 {
    public static void main(String[] args) {

        String arr[]={"A","G","M","L"};

        getElementFromArray(arr,1);
        getElementFromArray(arr,5);
        System.out.println("hi!");

    }


    //Array'lerde olmayan bir index kullanildiginda Java ArrayIndexOutOfBoundsException atar.
    public static void getElementFromArray(String[] s, int idx){

        try {
            String el=s[idx];
            System.out.println(el);

        }catch (ArrayIndexOutOfBoundsException e ){

            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }


         /*
        Aritmetik Exception yazdığınız code'da matematiksel işlem kullanıyorsanız alanabilecek bir Exception'dir.
        8) İçinde rakamlar dışında character olan bir String 'i sayıya çevirmek isterseniz Java "NumberFormatException" atar
        9) Bütün exceptionlar classtır
        10)String'lerde var olmayan index'ler kullanıldığında Java "StringIndexOutOfBoundsException" atar.
        11) Array'lerde olmayan index kullanıldığında ArrayIndexOutOfBounds atar.

      */

    }
}
