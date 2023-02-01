package selfstudy.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    //Example 1 ; Kullanici ile beraber bir array olusturunuz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksin");

        int numOfElement=input.nextInt();
        System.out.println("Cikmak icin Q'ya basiniz");

        String stdNames[]=new String[numOfElement];

        for (int i=1;i<=numOfElement;i++){
            System.out.println("Lutfen "+i+". ogrencinin ismini giriniz");
            String stdName=input.next();
            if (stdName.equalsIgnoreCase("Q")){
                break;
            }
            stdNames[i-1]=stdName;

        }
        System.out.println(Arrays.toString(stdNames));
    }
}
