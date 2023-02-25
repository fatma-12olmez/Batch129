package Recap.recapders2;

public class Apartman {
  private String cephe;

   private int katSayi;

   private int kira;


    public Apartman() {
    }

    public Apartman(String cephe, int katSayi, int kira) {
        this.cephe = cephe;
        this.katSayi = katSayi;
        this.kira = kira;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getKatSayi() {
        return katSayi;
    }

    public void setKatSayi(int katSayi) {
        this.katSayi = katSayi;
    }

    public int getKira() {
        return kira;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }

    @Override
    public String toString() {
        return "Apartman{" +
                "cephe='" + cephe + '\'' +
                ", katSayi=" + katSayi +
                ", kira=" + kira +
                '}';
    }
    //Bir pojo class'inda
    // 1)Variable olusturulmali,
    // 2)parametresiz constructor olusturulmali,
    // 3)parametreli constructor olusturulmali,
    // 4)getter ve setter olusturulmali
    // 5)to String() olusturulmali

   // instance method'a farkli bir class'dan ulasabilmek icin object olusturlmalidir.
}
