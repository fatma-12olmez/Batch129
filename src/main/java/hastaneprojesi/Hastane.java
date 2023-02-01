package hastaneprojesi;

import java.util.Scanner;

public class Hastane extends VeriBankasi {


    Doktor doktor = new Doktor();
    Hasta hasta = new Hasta();

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }

    public static void hastaneMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<-----OZEL TEAM 3 HASTANESINE HOSGELDINIZ----->");
        System.out.println();
        System.out.println("...Lutfen yapmak istediginiz islemi belirtin...\n +" +
                "1-Doktor Menusu\n" +
                "2-Hasta Menusu\n" +
                "3-Cikis");

    }
}
