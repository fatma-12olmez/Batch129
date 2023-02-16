package suleymanhoca.day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    /*
    1)Interface'lerden object olusturulamaz cunku interface'lerin constructtor'i yoktur.
    2)Abstract classlardan object olusturulamaz,constructor'lari vardir ama constructor object olusturmada kullanilmaz.
    3)interface'lerin constructor'lari olmadigindan collection olustururken interface  isimleri new keyword'unden sonra kullanilmaz.
    4) *class-->class==>extends
       class-->interface==>implements
       *interface-->interface==>extends
       interface -->class==> bu mumkun degildir
   5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
        yapilacaksa ArrayList kullanmak tavsiye edilmez.
        //Java Bu tarz işlemler için LinkedList'i oluşturmuştur.
        //LINKEDLIST lerde eleman kelimesi yerine "NODE" denir. LinkedList bas Node manasinda "HEAD", son Node "TAIL" denir.
           iki bolunden olusur data ve pointer bolumi
   6)LinkList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkList
     leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
     durumlarda LinkList kullanmak tavsiye edilir.
   7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
    8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
   bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.

        LinkedList<String> names=new LinkedList<>();
         List<String> cityNames=new LinkedList<>();   ikiside kullanilir

 */


    public static void main(String[] args) {
        List<String> cityNames = new LinkedList<>();


        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);//[Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda");//This method is equivalent to add.
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(3, "Suleyman");//[Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda]
        System.out.println(names);

        // names.clear();//list'in icindeki butun elemanlari siler

        names.remove("Ajda");//Ajda'yi siler ve loop'u kirar
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove(4);//Megan'i sildi
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

        names.add("Suleyman");
        names.add("Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman,Suleyman]

        String r1 = names.remove();//  Retrieves removes the first element of this list.(ilk elemani siler ve size verir)(cut paste)
        System.out.println(r1);//Cuneyt
        System.out.println(names);//[Steve, Suleyman, Raj, Brandon, Ajda, Suleyman,Suleyman]

        names.removeFirstOccurrence("Suleyman");//ilk gorunumu siler
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman,Suleyman]

        names.removeLastOccurrence("Suleyman");//son gorunumu siler
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman]

        //Retrieves, but does not remove, the first element of this list.(Copy+paste)
        //  Returns:the head of this list, or null if this list is empty
        //Ilk elemani silmeden size verir.
        //remove() ile peek() arasındaki fark ==> remove() ->remove siler ve gosterir   peek()-> gosterir silmez
        String r2 = names.peek();
        System.out.println(r2);//Steve
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Suleyman]

        //Returns:the head of this list, or null if this list is empty
        //Retrieves and removes the head (first element) of this list.(Cut+paste)
        // remove() bos LinkedList'te kullanilirsa "hata verir", poll()bos LinkedList'te kullanilirsa "null" verir.
        names.poll();



        //Pops removes and returns the first element of this list.(Cut+Paste)
        //This method is equivalent to removeFirst().
        //Pop()'la removeFirst() ayni isi gorur
        names.pop();




    }
}









