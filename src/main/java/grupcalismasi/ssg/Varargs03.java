package grupcalismasi.ssg;

public class Varargs03 {
    public static void main(String[] args) {
        // Kac tane il ismi verilirse verilsin
        // iclerinden en Uzun olani yazdiran bir method olusturun
      //  String il1 = "Adana";//5
      //  String il2 = "ankara";
      //  String il3 = "Istanbul";
     //   String il4 = "Bursa";
       // String il5 = "Van";



        enUzunIlIsmiYazdir("Adana","ankara","Istanbul","Bursa","Van");
    }
    public static void enUzunIlIsmiYazdir(String...str){
        String enUzunIlIsmi="";
        for (String w:str){
            if (w.length()>enUzunIlIsmi.length()) {

                enUzunIlIsmi = w;
            }
        }
        System.out.println("enUzunIlIsmi = " + enUzunIlIsmi);
    }
}
