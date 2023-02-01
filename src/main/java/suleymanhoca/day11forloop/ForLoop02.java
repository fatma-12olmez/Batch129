package suleymanhoca.day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {


        //Example 1:Verilen bir String'de  'a' character'i haric tum characterleri yazdiriniz.
        // String s ="Madagaskar";==>mdgskr
        String s ="Madagaskar";

        //1.Yol:
       String t= s.replace("a","");
        System.out.println(t);
        //2.Yol:
         for (int i=0;i<s.length();i++){

             char ch=s.charAt(i);
             if (ch!='a'){
                 System.out.print(ch);
             }
         }

        System.out.println();

         //3.yol;
        for (int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if (ch=='a'){
                continue;//Continue keyword'u bazi sartlar icin Loop'un adimlarini atlamamizi saglar
            }
            System.out.print(ch);
        }
    }
}
