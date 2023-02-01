package grupcalismasi.calisma02;

public class Ornek {
    public static void main(String[] args) {
        //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//   A
//   A A
//   A A A
//   A A A A

        for (int i=1; i<5;i++){

            String s="";

        for (int k=1; k<=i ;k++) {

            s +="A ";

         }
            System.out.println(s);
        }


    }

}
