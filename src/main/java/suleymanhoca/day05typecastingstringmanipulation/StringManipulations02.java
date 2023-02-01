package suleymanhoca.day05typecastingstringmanipulation;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s="Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
       boolean isEnd= s.endsWith("money");


        String t="Ali 13 yasindadir!...";
         //Example 9: "t"  String'indeki tum sesli harfleri "?"e ceviriniz.
        String t3=t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r!...

        //Example 10: "t" String'indeki kucuk harfler disindaki tum characterleri "<>" e ceviriniz
        String t4=t.replaceAll("[^a-z]","<>");
        System.out.println(t4);

       //Example 11: "t" String'indeki tum harfler disindaki tum characterleri "+" e ceviriniz
       String t5=t.replaceAll("[^a-zA-Z]","+");
       System.out.println(t5);

       //Example 12: "t" String'indeki space'ler disindaki tum character'leri "+" e ceviriniz
       String t6=t.replaceAll("[^ ]","+");
       System.out.println(t6);

      //Example 13: "t" String'indeki sesli harf'ler disindaki tum character'leri "&" e ceviriniz
       String t7=t.replaceAll("[^aeiouAEIOU]","&");
       System.out.println(t7);






















    }
}
