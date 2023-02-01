package grupcalismasi.ssg;

public class NoVarargs01 {
    public static void main(String[] args) {

        //Iki sayiyi toplayan bir method olusturun

        ucSayiyiToplayanMethod(4,7,8);//3 arguments
        ikiSayiyiToplayanMethod(5,7);//arguments
        display();//Zero arguments
    }
    public static void ikiSayiyiToplayanMethod(int a,int b){//iki parametreli
        System.out.println(a+b);
    }
    public static void ucSayiyiToplayanMethod(int a,int b,int c) { //uc pramatreli
        System.out.println(a + b + c);
    }


    public static void display(){//zero==0 parametreli

    }
}
