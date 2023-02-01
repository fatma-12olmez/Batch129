package Practice_Regular.nighttime08;

public class Edge extends Browser{

    String adresCubugu;


    public Edge() {
    }

    public Edge(String adresCubugu) {
      this.adresCubugu=adresCubugu;
    }

    @Override
    public void search() {
        System.out.println("Edge web sayfasinda arastirma yapar");

    }
    @Override
    public void sifrekaydetme() {
        System.out.println("Edge cookies'leri kabul edilenlerin  istenildiginde sifresini kaydeder");
    }

}
