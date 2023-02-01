package homeworks;

public class homeWorks01 {
    public static void main(String[] args) {

        //1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
       int dikdortgeninAlani= areaOfRectangle(10,5);
        System.out.println(dikdortgeninAlani);

        //2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
       double dikdortgeninCevresi= perimeterOfRectangle(2.5,6);
        System.out.println(dikdortgeninCevresi);

        //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
       int daireninCevresi= areoaOfCircle((int) 3.14,2);
        System.out.println(daireninCevresi);

        //4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz
       double daireninAlani= perimeterOfCircle(3.14,4);
        System.out.println(daireninAlani);

    }

    public static int areaOfRectangle(int a,int b){
        return a*b;
    }

    public static double perimeterOfRectangle(double a,double b){
        return 2*(a+b);
    }

    private static int areoaOfCircle(int  π,int r){
        return 2*π*r;
    }

    protected static double perimeterOfCircle(double  π,double r){
        return  π*r*r;
    }

}
