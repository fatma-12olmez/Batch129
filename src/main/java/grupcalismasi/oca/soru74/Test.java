package grupcalismasi.oca.soru74;

public class Test {
    public static void main(String[] args) {
        Test ex=new Test();
        int cardNo=12344;
        //ex.readCard(cardNo);//cevap "c"
        ex.checkCard(cardNo);
    }
  void readCard(int cardNo)throws Exception{
        System.out.println("Reading Card");
    }
    void checkCard(int cardNo)throws RuntimeException{
        System.out.println("Checking Card");
    }


}
