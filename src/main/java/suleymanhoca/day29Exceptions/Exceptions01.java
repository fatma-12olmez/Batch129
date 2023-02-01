package suleymanhoca.day29Exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        Object obj=70;
        String str="";
        try {
            str=(String) obj;//Birbirine donusturulemeyecek data type'larini donusturmekte israr ederseniz  Java ClassCastException atar.
            System.out.println(str);
        }catch (ClassCastException e){
            System.out.println("Her data type'i her data type'ine cevrilmez");
        }

    }
}

       //Java byte, short, int, long, float, and double (primitive'ler arasinda) arasinda casting yapabilir.
      // Ama Non-primitivleri ceviremez.
      //Bunu yapmaya calisirsaniz ClassCastException (Run Time Exception) alirsiniz.