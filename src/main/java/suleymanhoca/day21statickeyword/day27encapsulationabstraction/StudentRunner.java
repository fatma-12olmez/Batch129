package suleymanhoca.day21statickeyword.day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {

     // ***  //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile istedigimiz objeye cevirebiliriz

        Student myStd = new Student();

        //Student 1:
        System.out.println(myStd.getStdId());//AC123
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());

        //Student 2:
        myStd.setStdId("TH123");
        myStd.setGpa(4.0);  // set method object'i degistirir  yeni object uretildiginde orjinal degeri gosterir
        myStd.setPoor(false);




    }
}
