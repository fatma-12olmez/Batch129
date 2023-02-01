package grupcalismasi.calisma01;

import java.util.Scanner;

public class IfElse06 {
    public static void main(String[] args) {


     /*
        EXAMPLE 6:

         Kullanici gun numarasini girsin kod gun ismini yazsin

         ==> Pazar 2 ==> Pazartesi 3 ==> Sali 4 ==> Carsamba 5 ==> Persembe 6 ==> Cuma 7 ==> Cumartesi


      */

    Scanner input = new Scanner(System.in);

        System.out.println("Lutfen gun numarasi giriniz");
    int dayNum = input.nextInt();

          if(dayNum==1)

    {
        System.out.println("Sunday");
    }else if(dayNum==2) {
        System.out.println("Monday");
    }else if(dayNum==3) {
        System.out.println("Tuesday");
    }else if(dayNum==4) {
        System.out.println("Wednesday");
    }else if(dayNum==5) {
        System.out.println("Thursday");
    }else if(dayNum==6) {
        System.out.println("Friday");
    }else if(dayNum==7) {
        System.out.println("Saturday");
    }else {
        System.out.println("Lutfen gecerli bir gun sayisi giriniz...");
    }
}

}
