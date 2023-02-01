package tekrarlar.stringManipulation;

public class StringManipultions02Tekrar {
    public static void main(String[] args) {


        String s="Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.

       boolean isEnd= s.endsWith("money");
        System.out.println(isEnd);

        String t="Ali 13 yasindadir!...";
        //Example 9: "t"  String'indeki tum sesli harfleri "?"e ceviriniz.
        String rPlace= t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(rPlace);

    }
}
