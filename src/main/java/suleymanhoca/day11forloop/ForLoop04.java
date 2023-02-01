package suleymanhoca.day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {
        //Example 1: 5'den 8'e kadar tam sayilarin toplamini veren kodu yaziniz.(interview)
        //5+6+7+8==>26

        int sum=0;
        for (int i=5;i<9;i++){
            sum=sum+i;
        }
        System.out.println(sum);//26


        //Example 1: 7'den 9'e kadar tam sayilarin carpimini veren kodu yaziniz.(interview)
        // 7*8*9=
        int multiply=1;
        for (int i=7;i<10;i++) {

            multiply = multiply* i;
        }
            System.out.println(multiply);

    }
}
