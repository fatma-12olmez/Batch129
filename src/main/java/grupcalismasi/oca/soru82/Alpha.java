package grupcalismasi.oca.soru82;

public class Alpha {
    int ns;//default degeri kullaniyor
    static int s;
    Alpha(int ns){
        if(s<ns){
            s=ns;
            this.ns=ns;
        }
    }
    void doPrint(){
        System.out.println("ns= "+ ns + " s= "+s);
    }
}
