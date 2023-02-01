package suleymanhoca.day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.List;

public class DateTime01 {
    public static void main(String[] args) {


    //Date Class:
    Date mydate=new Date();

        System.out.println(mydate);//  Sat Jan 07 21:26:25 CET 2023

        System.out.println(mydate.getTime());// 1673123394790 ==>1 Ocak 1970 den su ana kadar ki mili saniye miktari

        //Icinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now()); // 2023-01-07
        System.out.println(LocalTime.now());//21:34:31.687813800
        System.out.println(LocalDateTime.now());//2023-01-07T21:36:20.629273100

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:45:12.816963900
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Paris")));
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));//2023-01-07T23:47:00.352078600


        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        //Geriki bir tarihe nasil gidilir?
        System.out.println( LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05


        //Ileriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3));//01:04:06.928559400

        //Geriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//21:19:06.928559400

        //Zaman'da belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//22:3

        //Tarih'te belli bir bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonthValue() + ":"+ LocalDate.now().getDayOfMonth());//1:7


        //Iki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007
       boolean result= LocalDate.of(2005,02,13).isAfter(LocalDate.of(2007,03,01));

        System.out.println(result);//false

        //Tarih'lerin formatlari nasil degistirilir?
        //M==>Tek rakamla ay no'sunu yazar
        //M==>iki rakamla ay no'sunu yazar
        //MMM==> ay isminin ilk uc harfini yazar
        //MMMM==> ay isminin tamamini yazar

        //d==>tek rakamla gun no'sunu yazar
        //dd==>cift  rakamla gun no'sunu yazar

        //yy==>Yilin son iki rakamini yazar
        //yyyy==>Yilin tamamini yazar
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println( dtf.format(LocalDate.now()));//07/01/2023






    }
}
