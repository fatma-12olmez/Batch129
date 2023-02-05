package suleymanhoca.day35lambda;

public class Utils {
    public static int getLengthSquare(String s){
        return s.length()*s.length();
    }
    public static boolean isEven(String s){
      return   s.length()%2==0;

    }
    public static String getLastChar(String s){
      return   s.substring(s.length()-1);
    }
    public static void printInTheSameLineWithASpace(Object obj) {
        System.out.print(obj + " ");
    }
}
