package suleymanhoca.day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {

    /*
    1)+,-,*,/,islemleri Java'da matematikte kullanildigi gibi kullanilir.
    Note 1:int/int==>int olur
    Note 2:double/int==>double olur.Cunku; Java'da matematiksel islemlerde farkli data type'lari kullanilirsa sonuc buyuk data type'inda olur

   2)Java'da"logical operators"(mantik operatorleri )lar vardir.

   i)  AND(&&) ve OR(||) islemleri "logical operators"lardir.
      "AND" isleminden "true" alabilmek icin hersey "true" olmalidir.(mukemmeliyetci)
      "AND" isleminde bir tane "false" varsa sonucu "false" yapar.

  ii)  "OR" isleminde bir tane "true" sonucu "true" yapmaya yeter
      "OR" isleminde sonucun "false" olmasi icin hersey "false" olmalidir.
      "OR" islemi " polyanna "gibidir.

  iii) NOT Operatoru(!) true olani false ,false olani true yapar
       !true=false
       !false=true
       !!true=true

   3) Karsilastirma Operatorler;(Comparison operators)
          <, >, <=, >=, ==,!=
      Note;Karsilastirma operatorlerini kullandiginizda kesinlikle boolean(true veya false) alirsinir.

      Note:AND islemi icin "&&" kullaniriz ama"&"kullanimda gecerlidir.
      Farklari nedir?
      "&&" kullanim ilk ifade ilk ifade false oldugunda digerlerini kontrol etmez dolasiyla hizli calsir.
      "&"ilk ifade ne olursa olsun digerlerini kontrol eder dolasiyla yavas calisir
      bu yuzden hep"&&" kullanilir.

     */

    public static void main(String[] args) {

       boolean first=3<5;

       boolean second=2+3!=5;

       boolean third =2+3*5>=19;



        System.out.println(first+" - " +second+" - "+third);
        System.out.println(first&&second);
        System.out.println(first||second||third);







    }
}
