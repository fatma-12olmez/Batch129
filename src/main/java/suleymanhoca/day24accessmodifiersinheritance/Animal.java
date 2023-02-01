package suleymanhoca.day24accessmodifiersinheritance;

public class Animal {
    /*
     Inheritance'in faydalari;
       1) Code standardında tekrar iyi değildir.
       2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
       3) Gelişime update'e açık olmalıdır
       4) Code atomic yapıda olmalı.
   Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
   Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
   Note 3: "public" method'lar child class'lar tarafindan kullanilabilir.
            "child-class'lar tarafinfan kullanilabilir" demek "inherit edilebilir" demektir.
   Note 4: "protected" method'lar "inherit edilebilir".
            cunku "protected" olan method ve variable'lar child'lar tarafindan kullanilir.
   Note 5 :"default" methodlar object ile ayni package'de olduklari surece inherit edilebilirler
           ama default method ile object'nin uretildigi class  farkli package'lerde ise inherit edilemezler
   Note 6 : "private" method'lar inherit edilemezler.
   Note 7 : Java birden fazla parent'i(multiple inheritance Java tarafindan desteklenmez) onaylamaz.
   Note 8 : child --->parent--->grand parent--->grand grand parent .... seklinde ilerleyen iheritance'lara "multi level inheritance" denir
   Note 9 : Java'da "object class" tum java class'larinin ortak parent'dir
   Note 10 : Java'da "object class" haric tum class'larin parent'i vardir
   Note 11 :Java'da parent'dan child'a olan iliskilere "HAS A Relationship" denir.
            Java'da child'dan parent'a olan iliskilere "IS A Relationship" denir.
   Note 12 :Java'da her class'in bir tane default constructor'i vardir.
            Bu default constructor class'in icinde gorunmez.cunku default constructor "object class" icindedir.
            Bizim class'imiz default constructor'a ihtiyac duydugunda parent olan "object class" a gider ve oradaki constructor'i kullanir.
     */


    protected void eat() {

        System.out.println("Animals eat...");

    }

    public void drink() {

        System.out.println("Animals drink...");

    }
}
