package selfstudy.Arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
//           icerdigi karakter sayilari toplamini ekrana yazdiriniz.

        String  arr[]=new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length()+arr[arr.length-1].length());

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        // icerdigi karakter sayilari toplamini ekrana yazdiriniz.
        String  brr[]=new String[5];
        brr[0]="Miami";
        brr[1]="Strasbourg";
        brr[2]="Istanbul";
        brr[3]="Athena";
        brr[4]="Dhaka";

        int sum=0;

        for (String w:brr){

            sum=sum+w.length();


        }
        System.out.println(sum);


        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        Integer ages[]=new Integer[6];
        ages[0]=12;
        ages[1]=20;
        ages[2]=9;
        ages[3]=28;
        ages[4]=55;
        ages[5]=30;

        System.out.println(Arrays.toString(ages));


        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);

    }
}
