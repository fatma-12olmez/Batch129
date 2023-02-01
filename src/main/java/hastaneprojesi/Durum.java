package hastaneprojesi;

public class Durum extends VeriBankasi{
    private String aktuelDurum;
    private boolean aciliyet;


    public String getAktuelDurum() {
        return aktuelDurum;
    }

    public Durum(String aktuelDurum, boolean aciliyet) {
        this.aktuelDurum = aktuelDurum;
        this.aciliyet = aciliyet;
    }

    public void setAktuelDurum(String aktuelDurum) {
        this.aktuelDurum = aktuelDurum;
    }

    public boolean isAciliyet() {
        return aciliyet;
    }

    public void setAciliyet(boolean aciliyet) {
        this.aciliyet = aciliyet;
    }
}
