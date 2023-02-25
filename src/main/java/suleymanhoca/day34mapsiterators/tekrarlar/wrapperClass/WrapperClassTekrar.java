package suleymanhoca.day34mapsiterators.tekrarlar.wrapperClass;

public class WrapperClassTekrar {
    public static void main(String[] args) {

        //Example 1: short data type'inn minimim ve maximum degerlerini kod yazarak bulunuz

        short shortMax=Short.MAX_VALUE;
        System.out.println(shortMax);
        short shortMin=Short.MIN_VALUE;
        System.out.println(shortMin);

        //Example 2: int data type'inin minimum degeri ile byte data type'inin maximum degerinin toplamini bulunuz.

        int intMin=Integer.MIN_VALUE;
        byte byteMax=Byte.MAX_VALUE;

        System.out.println(intMin+byteMax);

        //Example3: i)Primitive int'i Wrapper Integer'a ceviriniz

        int  num=12;
        Integer wrapperNum=num;
        System.out.println(wrapperNum);

        //ii)Wrapper byte'i primitive byte a cevirelim

        byte num2=120;
        Byte wrapperByte=num2;
        System.out.println(wrapperByte);

        //Example 4: i)Primitive char'i Wrapper Character'e ceviriniz.(Autoboxing)

        char a='b';
        Character wrapperA=a;
        System.out.println(wrapperA);

        //ii)Wrapper Boolean'i primitive boolean'a ceviriniz.(Unboxing)

        boolean isTrue=true;
        Boolean wrapperTrue=isTrue;
        System.out.println(wrapperTrue);

        //Example 5: Size String olan verilen iki fiyat'in toplamini ekrana yazdiriniz

        String shirt="2300";
        String shoes="1500";
        int total=Integer.valueOf(shirt)+Integer.valueOf(shoes);
        System.out.println(total);







    }

}
