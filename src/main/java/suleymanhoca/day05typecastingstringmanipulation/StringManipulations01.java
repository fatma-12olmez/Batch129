package suleymanhoca.day05typecastingstringmanipulation;

public class StringManipulations01 {

        //String bir non-primitive data type'dir ve ayni zamanda bir class'tir.
        public static void main(String[] args) {

            String s="Java is easy";

            //Example 1: "s" String'indeki tum character'leri buyuk harf yapiniz
            String sUpper=s.toUpperCase();
            System.out.println(sUpper);//JAVA IS EASY

            //Example 2: "s" String'indeki tum character'leri kucuk harf yapiniz
            String sLower=s.toLowerCase();
            System.out.println(sLower);//java is easy

            //Example 3:"s" String'indeki ilk character'i aliniz
             char firstChar=s.charAt(0);
            System.out.println(firstChar);

            //Example 4:"s" String'indeki ikinci ve sondan ikinci  character'i aliniz ve ekrana yan yana yazdiriniz.
            char secondChar=s.charAt(1);//a
            char secondLastChar=s.charAt(10);//s

            //I.yol: ayni satirda yazmak icin
            System.out.print(secondChar);
            System.out.println(secondLastChar);

            //II.yol: ayni satirda yazmak icin
            System.out.println(""+secondChar + secondLastChar);

            //Example 5:"s" String'inde kullanilan character sayisini bulunuz.
            int sLength=  s.length();
            System.out.println(sLength);//12

            //Example 6:"s" String'indeki ilk dort   character'i aliniz.
            //substring(0,4);==>"0" yani ilk index dahil "4" yani ikinci index haric'tir.[0,4)
            String sub1=s.substring(0,4);
            System.out.println(sub1);

            //Example 7:"s" String'indeki "is" kelimesini aliniz.
            String sub2=s.substring(5,7);
            System.out.println(sub2);

            //Example 8:"s" String'indeki "easy" kelimesini aliniz.
            String sub3=s.substring(8,12);
            System.out.println(sub3);

            // bir character'den baslayip string'in sonuna kadar almak isterseniz ,ikinci index'i yazmayiniz.
            //s.substring(8,12);yerine =s.substring(8); yaziniz.
            String sub4=s.substring(8);
            System.out.println(sub4);

            //Example 9:"s" String'inde "money" kelimesinin var olup olmadigini kontrol ediniz.
            boolean isExist=s.contains("money");
            System.out.println(isExist);
            /*
                  Bir method'uogrenirken 3 sey'i mutlaka ogrenin
                    i)Bu method ne is yapar?
                     ii)Bu method'un farkli kullanimlari nasildir.?
                       iii)Bu method size ne return eder?

             */



            //Example 10:"s"String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
             boolean isStart= s.startsWith("Java");
             System.out.println(isStart);


            //Example 11:"s"String'inin  6. character'den itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
            boolean isBegin= s.startsWith("i",5);
            System.out.println(isBegin);
        }
}
