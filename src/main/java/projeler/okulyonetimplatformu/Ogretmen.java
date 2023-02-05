package projeler.okulyonetimplatformu;

public class Ogretmen  {
    //Ogretmen Bilgileri
    private String ogretmenAdSoayad;
    private String ogretmenId;
    private int ogretmenYas;
    private String ogretmenBrans;
    private int ogretmanSicilNo;

    public Ogretmen(String ogretmenAdSoayad, String ogretmenId, int ogretmenYas, String ogretmenBrans, int ogretmanSicilNo) {
        this.ogretmenAdSoayad = ogretmenAdSoayad;
        this.ogretmenId = ogretmenId;
        this.ogretmenYas = ogretmenYas;
        this.ogretmenBrans = ogretmenBrans;
        this.ogretmanSicilNo = ogretmanSicilNo;
    }

    public String getOgretmenAdSoayad() {
        return ogretmenAdSoayad;
    }

    public void setOgretmenAdSoayad(String ogretmenAdSoayad) {
        this.ogretmenAdSoayad = ogretmenAdSoayad;
    }

    public String getOgretmenId() {
        return ogretmenId;
    }

    public void setOgretmenId(String ogretmenId) {
        this.ogretmenId = ogretmenId;
    }

    public int getOgretmenYas() {
        return ogretmenYas;
    }

    public void setOgretmenYas(int ogretmenYas) {
        this.ogretmenYas = ogretmenYas;
    }

    public String getOgretmenBrans() {
        return ogretmenBrans;
    }

    public void setOgretmenBrans(String ogretmenBrans) {
        this.ogretmenBrans = ogretmenBrans;
    }

    public int getOgretmanSicilNo() {
        return ogretmanSicilNo;
    }

    public void setOgretmanSicilNo(int ogretmanSicilNo) {
        this.ogretmanSicilNo = ogretmanSicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "ogretmenAdSoayad='" + ogretmenAdSoayad + '\'' +
                ", ogretmenId='" + ogretmenId + '\'' +
                ", ogretmenYas=" + ogretmenYas +
                ", ogretmenBrans='" + ogretmenBrans + '\'' +
                ", ogretmanSicilNo=" + ogretmanSicilNo +
                '}';
    }
}
