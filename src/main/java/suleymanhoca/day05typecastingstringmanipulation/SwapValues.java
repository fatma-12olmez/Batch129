package suleymanhoca.day05typecastingstringmanipulation;

public class SwapValues {

    //Swap:yer degistirmek. 1.Kap: Patates 2.Kap:Domates ==>1.Kap: Domates  2.Kap:Patates
    public static void main(String[] args) {

        int a=12;
        int b=5;   //Swap'tan sonra==>5,b=12;
        int temp=0;   //Temporary:gecici

        System.out.println("a: "+a);//12
        System.out.println("b: "+b);//5

        //1.yol
        //I.Adim
        temp=a;

        //II.Adim
        a=b;

        //  III.Adim
        b=temp;

        System.out.println("a: "+a);//5
        System.out.println("b: "+b);//12




        //2.Yol

        int x=12;
        int y=5;

        //I.Adim
        x=x+y;
        //II.Adim
        y=x-y;
        //III.Adim
        x=x-y;

        System.out.println("x: "+x);
        System.out.println("y: "+y);



    }
}
