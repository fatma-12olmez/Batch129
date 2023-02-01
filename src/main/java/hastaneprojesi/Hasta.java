package hastaneprojesi;

public class Hasta extends VeriBankasi {
    private String isim;
    private String soyisim;
    private int hastaID;
    private Durum hastaDurumu;

    public Hasta(String isim, String soyisim, int hastaID, Durum hastaDurumu) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.hastaID = hastaID;
        this.hastaDurumu = hastaDurumu;
    }

    public Hasta() {

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public Durum getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(Durum hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }


}
