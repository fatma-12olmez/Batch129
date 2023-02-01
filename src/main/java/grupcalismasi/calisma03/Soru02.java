package grupcalismasi.calisma03;

public class Soru02 {
    public static void main(String[] args) {

        /*
            EXAMPLE 2:
            Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
         */

        String dayName="CumarTesi";

        switch (dayName.toLowerCase()){
            case "pazar":
                System.out.println(1);
            break;
            case "pazartesi":
                System.out.println(2);
            break;
            case "sali":
                System.out.println(3);
            break;
            case "carsamba":
                System.out.println(4);
            break;
            case "persembe":
                System.out.println(5);
            break;
            case "cuma":
                System.out.println(6);
            break;
            case "cumartesi":
                System.out.println(7);
            break;
            default:

        }

    }
}
