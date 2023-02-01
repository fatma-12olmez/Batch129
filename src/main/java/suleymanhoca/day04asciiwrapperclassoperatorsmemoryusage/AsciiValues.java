package suleymanhoca.day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {

    //Note;Java da her karakterin sayisal bir degeri vardir.
    //Bu degerler ASCII degerler olarak adlandirilir.
    //Bu degerlerin tamaminin bulundugu tabloya "ASCII Table" denir.


    public static void main(String[] args) {

        //Herhangi bir karakterin ascii degerini bulmak icin o karakteri int data type'inda bir variable'in icine koyunuz.

        int ch='A';
        System.out.println(ch);

        int exclamation='!';
        System.out.println(exclamation);

        char c1='K';
        char c2='?';

        //Java'da char'lari matematiksel islemlerde kullanirsaniz,Java o char'larin ascii degerlerini kullanir.

        System.out.println(c1+c2);//138
    }
}
