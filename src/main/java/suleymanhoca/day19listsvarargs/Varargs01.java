package suleymanhoca.day19listsvarargs;

public class Varargs01 {
    public static void main(String[] args) {
        /*
        Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
        Method'un parantezleri icine yazilanlara "parametre" denir
        Method'u cagirirken kullanilan sayilara da "argument" denir.

        Note 1: Bir method'da 1 den fazla Varargs Parametre kullanilamaz cunku ikincisi "Unreachable Code"or"Unused Code" olur.Error verir
        Note 2: "Varargs", Varargs disindaki parametrelerle kullanilabilir ama "Varargs" her zaman "son parametre" olmalidir
     */

        addTwoNumbers(3, 5);
        addThreeNumbers(4,7,2);
        add(4, 5, 6, 7, 8, 9, 11);
    }




     //Istediginiz sayida sayiyi toplamak icin bir method olusturunuz
    public  static void add(int...a){
        int sum=0;

        for(int w:a){
            sum=sum+w;
        }
        System.out.println(sum);




    }
    //Iki sayiyi toplayan method olusturunuz

    public static void addTwoNumbers(int a, int b) {
        System.out.println(a + b);
    }
    //uc sayiyi toplayan method olusturunuz

    public static void addThreeNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }
  }
