package selfstudy.Arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {


        String names[]=new String[5];

        System.out.println(Arrays.toString(names));
        names[0]="Ali";
        names[1]="Can";
        names[2]="Hasan";
        names[3]="Sevgi";
        names[4]="Asli";

        System.out.println(Arrays.toString(names));

        System.out.println(names[4]);
        //Example:Array'deki her elemani sonuna "!" isareti koyarak ekrana yazdiriniz

        for (int i=0;i<names.length;i++){
            System.out.println(names[i] + "!");
        }
    }
}
