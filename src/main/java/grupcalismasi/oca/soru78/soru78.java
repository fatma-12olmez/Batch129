package grupcalismasi.oca.soru78;

public class soru78 {
    public static void main(String[] args) {
        String s1= "Java";
        String [] s2= { "J", "a", "v", "a"};
        String s3="";
        for (String str: s2){
            s3 = s3 +str;
        }
        boolean b1= (s1.equals(s3));
        boolean b2=(s1==s3);
        System.out.println(b1+" ,  "+b2);
    }
}
