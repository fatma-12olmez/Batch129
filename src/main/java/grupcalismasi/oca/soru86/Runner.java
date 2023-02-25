package grupcalismasi.oca.soru86;

public class Runner {
    public static void main(String[] args) {
        A b1=new A();
        A b2=new C();
        A b3=(A) b2;
        b1=(A)b2;
       b1.test();
       b3.test();
    }
}
