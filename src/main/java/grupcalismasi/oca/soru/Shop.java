package grupcalismasi.oca.soru;



public class Shop {
    public static void main(String[] args) {
        int price=1000;
        int qty=2;
        String grade="2";
        double discount =0.0;

        switch (grade){
            case "1":
            discount =price*0.1;
            break;
            case "2":
                discount =price*0.5;
          //  continue;  //Continue switchelerde kullanilmaz  o yuzden CTE verdi
            default:
                System.out.println("Thank you");
        }
             System.out.println(discount);
    }
}
